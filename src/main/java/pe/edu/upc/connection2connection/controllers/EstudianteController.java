package pe.edu.upc.connection2connection.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.connection2connection.dtos.EmpresaDTO;
import pe.edu.upc.connection2connection.dtos.EstudianteDTO;
import pe.edu.upc.connection2connection.entities.Empresa;
import pe.edu.upc.connection2connection.entities.Estudiante;
import pe.edu.upc.connection2connection.services.IEstudianteService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {
    @Autowired
    private IEstudianteService eS;

    @PostMapping
    public void registrar(@RequestBody EstudianteDTO dto) {
        ModelMapper m = new ModelMapper();
        Estudiante e = m.map(dto, Estudiante.class);
        eS.insertar(e);
    }


    @GetMapping
    public List<EstudianteDTO> listar() {
        return eS.listar().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,EstudianteDTO.class);

        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id){
        eS.delete(id);
    }

    @GetMapping("/{id}")
    public EstudianteDTO ListId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
            EstudianteDTO dto = m.map(eS.ListId(id), EstudianteDTO.class);
        return dto;
    }

    @PutMapping
    public void goUpdate(@RequestBody EstudianteDTO dto){
        ModelMapper m = new ModelMapper();
        Estudiante e = m.map(dto, Estudiante.class);
        eS.insertar(e);
    }
}
