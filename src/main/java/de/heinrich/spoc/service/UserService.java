package de.heinrich.spoc.service;

import de.heinrich.spoc.domain.User;
import de.heinrich.spoc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    public Optional<User> findUserByName(String name){
        return userRepository.findUserByUsername(name);
    }
    public List<User> getUsers() {return (List<User>) userRepository.findAll();}
}
