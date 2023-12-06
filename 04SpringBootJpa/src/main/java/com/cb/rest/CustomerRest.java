package com.cb.rest;

import com.cb.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerRest {

    @PostMapping
    public void register(@RequestBody CustomerDTO customer){

    }

}
