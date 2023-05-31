package pe.edu.upc.connection2connection.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.connection2connection.entities.Requisito;

@Repository
public interface IRequisitoRepository extends JpaRepository<Requisito , Integer> {
}
