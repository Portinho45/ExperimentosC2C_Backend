package pe.edu.upc.connection2connection.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Repository;
import pe.edu.upc.connection2connection.entities.Usuario;

import java.util.List;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {
    public Usuario findByUsername(String username);

    //BUSCAR POR NOMBRE
    @Query("select count(u.username) from Usuario u where u.username =:username")
    public int buscarUsername(@Param("username") String nombre);
  
    //INSERTAR ROLES
    @Transactional
    @Modifying
    @Query(value = "insert into roles (rol, usuario_id) VALUES (:rol, :user_id)", nativeQuery = true)
    public void insRol(@Param("rol") String authority, @Param("user_id") Long user_id);

    @Query(value = "select count(u.id_usuario) as CantidadUsuarios,u.rol as Rol\n" +
            "from usuarios u\n" +
            "group by u.rol;", nativeQuery = true)
    List<String[]> usuariosporrol();
}
