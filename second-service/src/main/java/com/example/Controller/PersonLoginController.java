package com.example.Controller;

import org.springframework.web.bind.annotation.GetMapping;

public class PersonLoginController {

    //This is where you call your Endpoints Remember the base URL

    @GetMapping
    public String getLoginDetails() {

        return "These are all the login details of the User";
    }
}
