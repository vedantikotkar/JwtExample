package com.jwt.example.models;


import lombok.*;

@Getter
@Setter
//@NoArgsConstructor
//@AllArgsConstructor
@Builder
@ToString


public class JwtResponse {
    private String jwtToken;
    private String username;

    // Constructors, getters, and setters
    public JwtResponse() {}

    public JwtResponse(String jwtToken, String username) {
        this.jwtToken = jwtToken;
        this.username = username;
    }

    public String getJwtToken() {
        return jwtToken;
    }

    public void setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
