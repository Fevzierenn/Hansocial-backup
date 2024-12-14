package org.example.hansocial.requests;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.management.ConstructorParameters;


public class LoginRequest {

    public String getEmail() {
        return email;
    }

    public LoginRequest(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String email;
    private String password;
}
