package com.jwt.example.models;

import lombok.*;

@Getter
@Setter
//@NoArgsConstructor
//@AllArgsConstructor
@Builder
@ToString


public class JwtRequest {
    private String email;
    private String password;

    // Constructors, getters, and setters
    public JwtRequest() {}

    public JwtRequest(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
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
}
