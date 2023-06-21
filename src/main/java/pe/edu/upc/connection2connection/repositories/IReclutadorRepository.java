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

}
