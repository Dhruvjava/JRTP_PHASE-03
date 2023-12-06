package com.cb.dto;

import lombok.*;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {

    private String name;

    private String email;

    private String department;

    private String city;
}
