package pe.edu.upc.connection2connection.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.connection2connection.entities.Carrera;

@Repository
public interface ICarreraRepository extends JpaRepository<Carrera, Integer> {

}