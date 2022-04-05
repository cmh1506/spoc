package de.heinrich.spoc.controller;

import de.heinrich.spoc.auth.ApplicationUser;
import de.heinrich.spoc.domain.User;
import de.heinrich.spoc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
public class SpocLoginController {
    private final UserService userService;
    @Autowired
    public SpocLoginController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/user")
    public ResponseEntity<de.heinrich.spoc.dto.User> user(Principal user) {
        if(!(((UsernamePasswordAuthenticationToken) user).getPrincipal() instanceof ApplicationUser)){
            return null; //ToDo: Handle this problem;
        }
        Optional<User> userDomain = userService.findUserByName(((ApplicationUser)((UsernamePasswordAuthenticationToken) user).getPrincipal()).getUsername());
        de.heinrich.spoc.dto.User toReturn = null;
        try{
            toReturn = userService.transformEntity(userDomain.orElseThrow());
        } catch (Exception e) {
            //Handle Exception
        }
        return new ResponseEntity<>(toReturn, HttpStatus.ACCEPTED);
    }
    /*@GetMapping("/login")
    public Optional<Long> login(){
        Object principal = SecurityContextHolder. getContext(). getAuthentication(). getPrincipal();
        if(!(principal instanceof ApplicationUser)){
            return null; //ToDo: Handle this problem;
        }
        Optional<User> user = userService.findUserByName(((ApplicationUser)principal).getUsername());
        return Optional.ofNullable(user.get().getId());
    }*/
    /*@GetMapping("/login")
    public Principal login(Principal user){
        return user;
    }*/



}
