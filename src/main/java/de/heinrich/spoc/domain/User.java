package de.heinrich.spoc.domain;

import de.heinrich.spoc.security.ApplicationUserRole;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.List;

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

    public List<Verpackung> getVerpackung() {
        return verpackung;
    }

    public void setVerpackung(List<Verpackung> verpackung) {
        this.verpackung = verpackung;
    }

    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "user", orphanRemoval = true)
    private List<Verpackung> verpackung;
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

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.role = ApplicationUserRole.ADMIN;
        this.email = email;
        this.isAccountNonExpired = true;
        this.isAccountNonLocked = true;
        this.isCredentialsNonExpired = true;
        this.isEnabled = true;
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
