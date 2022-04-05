package de.heinrich.spoc.controller;

import de.heinrich.spoc.domain.User;
import de.heinrich.spoc.dto.PWChangeType;
import de.heinrich.spoc.repository.UserRepository;
import de.heinrich.spoc.security.ApplicationUserRole;
import de.heinrich.spoc.service.EmailSenderService;
import de.heinrich.spoc.service.UserService;

import org.apache.commons.text.RandomStringGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLNonTransientException;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/user")
public class UserController {

    private final UserService userService;
    private final EmailSenderService mailService;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public UserController(UserService userService, EmailSenderService emailSenderService, PasswordEncoder passwordEncoder) {
        this.userService = userService;
        this.mailService = emailSenderService;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping("/users")
    public List<de.heinrich.spoc.dto.User> getUsers() {
        return (List<de.heinrich.spoc.dto.User>) userService.findAll();
    }

    @PostMapping("/addUser")
    public ResponseEntity<de.heinrich.spoc.dto.User> addUser(@RequestBody de.heinrich.spoc.dto.User user) {
        //ToDo: move to service? Check if email already exists.
        if(userService.findUserByEmail(user.getEmail()).isPresent()){
            return new ResponseEntity(HttpStatus.valueOf(422));
        }
        if(userService.findUserByName(user.getUsername()).isPresent()){
            return new ResponseEntity(HttpStatus.valueOf(423));
        }
        RandomStringGenerator pwdGenerator = new RandomStringGenerator.Builder().withinRange(33, 45)
            .build();
        user.setPassword(pwdGenerator.generate(8));
        user.setRole(ApplicationUserRole.KUNDE.name());
        de.heinrich.spoc.dto.User toReturn = null;
        try{
            toReturn = userService.transformEntity(userService.addUser(user));
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        mailService.sendEmail(user.getEmail(), "Your password is " + user.getPassword(), "Spoc");

        return new ResponseEntity<>(toReturn, HttpStatus.CREATED);
    }
    @PostMapping("/changePW")
    public ResponseEntity<?> changePW(@RequestBody PWChangeType pwChangeType){
        User user = userService.findUserById(pwChangeType.getId()).orElseThrow();
        user.setPassword(passwordEncoder.encode(pwChangeType.getPassword()));
        userService.updateUser(user);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable("id") Long id){
        userService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}