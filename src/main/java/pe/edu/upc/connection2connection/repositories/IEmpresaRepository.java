package pe.edu.upc.connection2connection.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.connection2connection.entities.Empresa;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IEmpresaRepository extends JpaRepository<Empresa, Integer> {

    @Query(value = "SELECT e.nombre_Empresa AS NombreEmpresa, COUNT(r.id) AS CantidadReclutadores " +
            "FROM Empresa e " +
            "LEFT JOIN reclutadores r ON e.id = r.Empresa_id " +
            "GROUP BY e.nombre_Empresa", nativeQuery = true)
    List<String[]> obtenerNumeroReclutadoresEmpresa();

}
