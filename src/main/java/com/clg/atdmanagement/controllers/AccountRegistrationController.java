package com.clg.atdmanagement.controllers;


import com.clg.atdmanagement.beans.Student;
import com.clg.atdmanagement.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("registration")
public class AccountRegistrationController {

    @Autowired
    AccountService accountService;

    @PostMapping(value = "/register",consumes = "application/json")
    public String register(@RequestBody Student student){
    	System.out.println("##########"+student);
    	
        accountService.saveAccount(student);
        return "Success";
    }
}
