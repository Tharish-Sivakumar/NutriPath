package com.example.demo.dto;

public class AuthResponseDto {

    private String token;
    private String email;
    private String role;

    public AuthResponseDto() {
    }

    public AuthResponseDto(String token, String email, String role) {
        this.token = token;
        this.email = email;
        this.role = role;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // Builder Pattern
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String token;
        private String email;
        private String role;

        public Builder token(String token) {
            this.token = token;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder role(String role) {
            this.role = role;
            return this;
        }

        public AuthResponseDto build() {
            return new AuthResponseDto(token, email, role);
        }
    }
}