package de.heinrich.spoc.controller;

import de.heinrich.spoc.auth.ApplicationUser;
import de.heinrich.spoc.domain.User;
import de.heinrich.spoc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:80")
public class SpocLoginController {
    private final UserService userService;
    @Autowired
    public SpocLoginController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/spoclogin")
    public Optional<Long> login(){
        Object principal = SecurityContextHolder. getContext(). getAuthentication(). getPrincipal();
        if(!(principal instanceof ApplicationUser)){
            return null; //ToDo: Handle this problem;
        }
        Optional<User> user = userService.findUserByName(((ApplicationUser)principal).getUsername());
        return Optional.ofNullable(user.get().getId());
    }
}
