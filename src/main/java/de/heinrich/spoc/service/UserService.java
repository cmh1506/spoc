package de.heinrich.spoc.service;

import de.heinrich.spoc.domain.User;
import de.heinrich.spoc.domain.Verpackung;
import de.heinrich.spoc.repository.UserRepository;
import de.heinrich.spoc.security.ApplicationUserRole;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLNonTransientException;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;
    PasswordEncoder passwordEncoder;

    @Autowired
    public UserService(UserRepository userRepository,
                       PasswordEncoder passwordEncoder){
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public Optional<User> findUserById(Long id) {
        return userRepository.findUserById(id);
    }

    public Optional<User> findUserByName(String name){
        return userRepository.findUserByUsername(name);
    }
    public List<User> getUsers() {return (List<User>) userRepository.findAll();}

    public User addUser(de.heinrich.spoc.dto.User user) throws SQLIntegrityConstraintViolationException {
        de.heinrich.spoc.domain.User toSave = new User();
        toSave.setUsername(user.getUsername());
        toSave.setEmail(user.getEmail());
        toSave.setPassword(passwordEncoder.encode(user.getPassword()));
        toSave.setRole(ApplicationUserRole.valueOf(user.getRole()));
        toSave.setAccountNonExpired(true);
        toSave.setAccountNonLocked(true);
        toSave.setCredentialsNonExpired(true);
        toSave.setEnabled(true);
        return userRepository.save(toSave);
    }

    public List<de.heinrich.spoc.dto.User> findAll() {
        return userRepository.findAllUsers();
    }

    public Optional<User> findUserByEmail(String userEmail) {
        return userRepository.findUserByEmail(userEmail);
    }

    public de.heinrich.spoc.dto.User transformEntity(User user) {
        de.heinrich.spoc.dto.User toReturn = new de.heinrich.spoc.dto.User();
        toReturn.setUsername(user.getUsername());
        toReturn.setEmail(user.getEmail());
        toReturn.setId(user.getId());
        toReturn.setPassword(user.getPassword());
        toReturn.setRole(user.getRole().name());
        return toReturn;
    }

    public void deleteUser(Long id) {
        User user = userRepository.findUserById(id).orElseThrow();
        user.setEnabled(false);
        userRepository.save(user);
    }

    public User updateUser(User user){
        return userRepository.save(user);
    }
}
