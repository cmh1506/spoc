package de.heinrich.spoc.controller;

import de.heinrich.spoc.domain.User;
import de.heinrich.spoc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
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
        userRepository.save(user);
    }
}