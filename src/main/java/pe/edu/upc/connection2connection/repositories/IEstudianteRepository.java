package pe.edu.upc.connection2connection.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.connection2connection.entities.Estudiante;

import java.util.List;

@Repository
public interface IEstudianteRepository extends JpaRepository<Estudiante, Integer> {
    @Query(value = "select count(e.id_estudiante) as cantidadestudiante, e.semestre_estudiante as Semestre\n" +
            "FROM estudiantes e\n" +
            "GROUP BY e.semestre_estudiante;", nativeQuery = true)
    List<String[]> cantidadestudiantesporsemestre();

    @Query(value = "select round(avg(e.edad_estudiante),3) as edadpromedio, count(e.id_estudiante) as totalestudiantes\n" +
            "from estudiantes e\n;", nativeQuery = true)
    List<String[]> promedioedad();

    @Query(value = "select count(case when e.edad_estudiante > 20 then 1 end) as Estudiantes_mayores,\n" +
            "  count(case when e.edad_estudiante <= 20 then 1 end) as Estudiantes_menores\n" +
            "from estudiantes e;", nativeQuery = true)
    List<String[]> mayoresymenores();
    @Query(value = "select (count(case when e.practicante_estudiante=true then 1 end)*100/count(*)) as Porcentaje_Busca_Practicas,\n" +
            "(count(case when e.practicante_estudiante=false then 1 end)*100/count(*)) as Porcentaje_No_Busca_Practicas\n" +
            "from estudiantes e;", nativeQuery = true)
    List<String[]> buscapracticasporcentaje();
    @Query(value = "select count(e.id_estudiante) as CantidadEstudiantes, i.nombre_institucion as Institucion\n" +
            "from estudiantes e\n" +
            "join institucion_educativa i on i.id = e.institucion_educativa_id\n" +
            "group by i.nombre_institucion", nativeQuery = true)
    List<String[]> estudiantesporinstitucion();
}
