package pe.edu.upc.connection2connection.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.connection2connection.entities.Carreras_Estudiante;

@Repository
public interface ICarreras_EstudianteRepository extends JpaRepository<Carreras_Estudiante, Integer> {

}
