package org.cb;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@OpenAPIDefinition(info = @Info(summary = "BOOKING-SERVICE",
                description = "This service is a booking module functionality.",
                contact = @Contact(name = "CodeBrain Pvt. Ltd.", url = "http://www.codebrain.com/",
                                email = "mailto:info@codebrain.com"),
                license = @License(name = "MIT License",
                                url = "http://www.opensource.org/licenses/mit-license"),
                termsOfService = "Movie Booking Term & Conditions"),
                servers = {@Server(description = "Movie Booking Local Environment",
                                url = "http://localhost:8061/dev")},
                security = {@SecurityRequirement(name = "BearerAuth")})
@SecurityScheme(name = "BearerAuth", description = "JWT Authorization", bearerFormat = "JWT",
                scheme = "bearer", type = SecuritySchemeType.HTTP, in = SecuritySchemeIn.HEADER)
public class BookingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookingServiceApplication.class, args);
    }

    @Bean
    public MessageSource errorSource() {
        ReloadableResourceBundleMessageSource source = new ReloadableResourceBundleMessageSource();
        source.setBasename("classpath:/bundles/application_error");
        return source;
    }

    @Bean
    public MessageSource messageSource() {
        ReloadableResourceBundleMessageSource source = new ReloadableResourceBundleMessageSource();
        source.setBasename("classpath:/bundles/application_message");
        return source;
    }

}
