package pe.edu.upc.connection2connection.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.connection2connection.entities.Calificacion_Estudiante;

@Repository
public interface ICalificacion_EstudianteRepository extends JpaRepository<Calificacion_Estudiante, Integer> {
}
