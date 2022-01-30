package de.heinrich.spoc.controller;

import de.heinrich.spoc.domain.User;
import de.heinrich.spoc.repository.UserRepository;
import de.heinrich.spoc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<de.heinrich.spoc.dto.User> getUsers() {
        return (List<de.heinrich.spoc.dto.User>) userService.findAll();
    }

    @PostMapping("/addUser")
    public ResponseEntity<de.heinrich.spoc.dto.User> addUser(@RequestBody de.heinrich.spoc.dto.User user) {
        de.heinrich.spoc.dto.User toReturn = userService.transformEntity(userService.addUser(user));
        return new ResponseEntity<>(toReturn, HttpStatus.CREATED);
    }
}