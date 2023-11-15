package com.cb.rest;

import com.cb.service.IBankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bank")
public class BankAccRest {

    @Autowired
    private IBankAccountService bankAccountService;

    @GetMapping("/transactions")
    public void accountTransaction() {
    bankAccountService.accountTransaction();
    }

    @GetMapping("/statements")
    public void accountStatement(){
        bankAccountService.accountStatement();
    }

}
