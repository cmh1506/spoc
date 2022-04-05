package de.heinrich.spoc.repository;

import de.heinrich.spoc.domain.User;
import de.heinrich.spoc.dto.Material;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("select new de.heinrich.spoc.dto.User(u.id, u.username, u.password, u.role, u.email) from User u where u.isEnabled = true order by u.username")
    List<de.heinrich.spoc.dto.User> findAllUsers();

    Optional<User> findUserByUsername(String name);

    Optional<User> findUserById(Long id);

    Optional<User> findUserByEmail(String userEmail);
}