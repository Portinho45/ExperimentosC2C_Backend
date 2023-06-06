package pe.edu.upc.connection2connection.controllers;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.connection2connection.dtos.CarreraDTO;
import pe.edu.upc.connection2connection.entities.Carrera;
import pe.edu.upc.connection2connection.services.ICarreraService;

import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/Carreras")
public class CarreraController {
    @Autowired
    private ICarreraService aS;

    @PostMapping
    public void insert(@RequestBody CarreraDTO dto){
        ModelMapper m = new ModelMapper();
        Carrera e = m.map(dto,Carrera.class);
        aS.insert(e);
    }

    @GetMapping
    public List<CarreraDTO> list(){
        return aS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, CarreraDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id){
        aS.delete(id);
    }
    @GetMapping("/{id}")
    public CarreraDTO ListId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        CarreraDTO dto = m.map(aS.ListId(id), CarreraDTO.class);
        return dto;
    }
    @PutMapping
    public void goUpdate(@RequestBody CarreraDTO dto){
        ModelMapper m = new ModelMapper();
        Carrera e = m.map(dto, Carrera.class);
        aS.insert(e);
    }
}
