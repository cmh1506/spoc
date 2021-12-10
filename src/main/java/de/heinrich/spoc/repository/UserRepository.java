package de.heinrich.spoc.repository;

import de.heinrich.spoc.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findUserByUsername(String name);

    User findUserById(Long id);

    User findUserByEmail(String userEmail);
}