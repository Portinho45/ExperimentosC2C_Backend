package pe.edu.upc.connection2connection.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.connection2connection.entities.Usuario;

public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {
}
