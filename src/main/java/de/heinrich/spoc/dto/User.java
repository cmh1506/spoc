package de.heinrich.spoc.dto;

import de.heinrich.spoc.security.ApplicationUserRole;
import static javax.persistence.EnumType.STRING;

import javax.persistence.Enumerated;

public class User {
    public User(long id, String username, String password, ApplicationUserRole role, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role.name();
        this.email = email;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User() {
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    private long id;
    private String username;
    private String password;
    private String role;
    private String email;
}
