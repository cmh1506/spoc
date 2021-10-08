package de.heinrich.spoc.auth;

import de.heinrich.spoc.domain.User;
import de.heinrich.spoc.security.ApplicationUserRole;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("fake")
public class FakeApplicationUserDaoService implements ApplicationUserDao{
    private final PasswordEncoder passwordEncoder;
    @Autowired
    public FakeApplicationUserDaoService(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public Optional<ApplicationUser> selectAppliationUserByUsername(String username) {
        //return getApplicationUsers().stream().filter(applicationUser -> username.equals(applicationUser.getUsername())).findFirst();
        return null;
    }

    /*private List<User> getApplicationUsers(){
        List<User> applicationUsers = Lists.newArrayList(

                new User("Claus", passwordEncoder.encode("12345"), ApplicationUserRole.ADMIN.getGrantedAuthorities(), true, true, true, true),
                new User("Phil", passwordEncoder.encode("12345"), ApplicationUserRole.STUDENT.getGrantedAuthorities(), true, true, true, true),
                new User("Maria", passwordEncoder.encode("12345"), ApplicationUserRole.ADMINTRAINEE.getGrantedAuthorities(), true, true, true, true)
        );
        return null;
    }*/
}
