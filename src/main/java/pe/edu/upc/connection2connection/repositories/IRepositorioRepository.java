package pe.edu.upc.connection2connection.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.connection2connection.entities.Repositorio;

import java.util.List;

@Repository
public interface IRepositorioRepository extends JpaRepository<Repositorio, Integer> {
    @Query(value = "SELECT u.Nombre_Usuario AS NombreEstudiante,u.correo_usuario AS CorreoEstudiante, e.Edad_estudiante AS Edad, e.Practicante_estudiante AS PracticanteEstudiante, COUNT(r.id) AS CantidadRepositorios\n" +
            "FROM usuarios u\n" +
            "JOIN estudiantes e ON u.id_usuario = e.usuario_id\n" +
            "LEFT JOIN repositorios r ON e.id_estudiante = r.id_estudiante\n" +
            "GROUP BY u.Nombre_Usuario, u.correo_usuario, e.Edad_estudiante, e.Practicante_estudiante;", nativeQuery = true)
    List<String[]> obtenerNumRepositorios();

}
