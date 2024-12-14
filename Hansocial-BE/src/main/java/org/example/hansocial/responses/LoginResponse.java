package org.example.hansocial.responses;


import lombok.AllArgsConstructor;
import lombok.Data;

public class LoginResponse {
    private Long id;
    private String username;
    private String email;
    private int avatar;

    public LoginResponse(Long id, String username, String email, int avatar) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.avatar = avatar;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }
}
