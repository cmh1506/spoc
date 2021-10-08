package de.heinrich.spoc.domain;

import de.heinrich.spoc.security.ApplicationUserRole;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import static javax.persistence.EnumType.STRING;

@Entity
@Table(name = "user", schema = "spoc")
public class User {
    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )
    private long id;
    private  String username;
    private  String password;
    @Enumerated(STRING)
    private  ApplicationUserRole role;
    private String email;
    private  boolean isAccountNonExpired;
    private  boolean isAccountNonLocked;
    private  boolean isCredentialsNonExpired;
    private  boolean isEnabled;

    public User(String username, String password, ApplicationUserRole role, String email, boolean isAccountNonExpired, boolean isAccountNonLocked, boolean isCredentialsNonExpired, boolean isEnabled) {

        this.username = username;
        this.password = password;
        this.role = role;
        this.email = email;
        this.isAccountNonExpired = isAccountNonExpired;
        this.isAccountNonLocked = isAccountNonLocked;
        this.isCredentialsNonExpired = isCredentialsNonExpired;
        this.isEnabled = isEnabled;
    }

    public User() {

    }

    public ApplicationUserRole getRole() {
        return role;
    }

    public String getEmail() {
        return email;
    }


    public String getPassword() {
        return password;
    }


    public String getUsername() {
        return username;
    }


    public boolean isAccountNonExpired() {
        return isAccountNonExpired;
    }


    public boolean isAccountNonLocked() {
        return isAccountNonLocked;
    }


    public boolean isCredentialsNonExpired() {
        return isCredentialsNonExpired;
    }


    public boolean isEnabled() {
        return isEnabled;
    }
}
