package by.pdu.creditsystem.repository;

import by.pdu.creditsystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
