package pe.edu.upc.connection2connection.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.connection2connection.entities.Match;


public interface IMatchRepository extends JpaRepository<Match, Integer> {
}
