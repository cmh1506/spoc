package de.heinrich.spoc.auth;

import de.heinrich.spoc.domain.User;

import java.util.Optional;

public interface ApplicationUserDao {
    Optional<ApplicationUser> selectAppliationUserByUsername(String username);
}
