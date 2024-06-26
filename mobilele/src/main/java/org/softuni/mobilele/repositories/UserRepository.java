package org.softuni.mobilele.repositories;

import org.softuni.mobilele.domain.entities.User;
import org.softuni.mobilele.services.implementations.MobileleUserDetailsService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findById(Long id);

    Optional<User> getByUsername(String username);

    Optional<User> findByUsernameAndPassword(String username,String password);

    Optional<User> findByUsername(String username);
}
