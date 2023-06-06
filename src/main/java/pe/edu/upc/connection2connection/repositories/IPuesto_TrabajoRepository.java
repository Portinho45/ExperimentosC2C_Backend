package pe.edu.upc.connection2connection.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.connection2connection.entities.Puesto_Trabajo;

@Repository
public interface IPuesto_TrabajoRepository extends JpaRepository<Puesto_Trabajo, Integer> {
}
