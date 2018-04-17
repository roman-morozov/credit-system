package by.pdu.creditsystem.repository;

import by.pdu.creditsystem.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
