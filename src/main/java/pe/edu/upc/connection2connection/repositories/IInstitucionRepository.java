package pe.edu.upc.connection2connection.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.connection2connection.entities.Institucion;

@Repository
public interface IInstitucionRepository extends JpaRepository<Institucion, Integer> {
}
