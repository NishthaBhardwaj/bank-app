package com.nishthasoft.account.controller;

import com.nishthasoft.account.model.Accounts;
import com.nishthasoft.account.model.Customer;
import com.nishthasoft.account.repository.AccountsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @Autowired
    private AccountsRepository accountRepository;

    @PostMapping("/myAccount")
    public Accounts getAccontDetails(@RequestBody Customer customer){
        Accounts account = accountRepository.findByCustomerId(customer.getCustomerId());{

            return account;


        }

    }
}
