package de.heinrich.spoc.controller;

import de.heinrich.spoc.domain.User;
import de.heinrich.spoc.repository.UserRepository;
import de.heinrich.spoc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return (List<User>) userService.findAll();
    }



    /*@PostMapping("/addUser")
    void addUser(@RequestParam(required = false) String username,
                 @RequestParam(required = false) String password,
                 @RequestParam(required = false) String email) {
        User user = new User(username, password, email);

        userRepository.save(user);
    }*/

    @PostMapping("/addUser")
    void addUser(@RequestBody User user) {
        userService.save(user);
    }
}