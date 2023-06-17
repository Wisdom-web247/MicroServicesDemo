package com.example.Models;

public class PersonLogin {

    //Add Dependencies first before using the annotations
    //@NotBlank
    private String username;

    /*@NotBlank
    @Min(8)
    @Max(32)*/
    private String password;

    //Default Constructor
    public PersonLogin() {
    }

    //Parameterized Constructor
    public PersonLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
