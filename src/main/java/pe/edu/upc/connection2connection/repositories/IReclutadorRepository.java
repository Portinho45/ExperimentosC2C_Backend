package pe.edu.upc.connection2connection.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.connection2connection.entities.Empresa;
import pe.edu.upc.connection2connection.entities.Reclutador;

import java.util.List;

@Repository
public interface IReclutadorRepository extends JpaRepository<Reclutador, Integer> {

    @Query("from Reclutador v where v.empresa =:empresa")
    List<Reclutador> findBynombreEmpresa(@Param("empresa") Empresa empresa);

    @Query(value = "select count(distinct m.estudiante_id) as EstudiantesMatch, u.nombre_usuario as Reclutador\n" +
            "from match m\n" +
            "join reclutadores r on r.id=m.reclutador_id\n" +
            "join usuarios u on r.usuario_id=u.id_usuario\n" +
            "group by u.nombre_usuario", nativeQuery = true)
    List<String[]> MatchReclutador();
}
