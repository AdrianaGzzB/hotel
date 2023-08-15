package com.codellege.hotel.controller;
import com.codellege.hotel.model.Huesped;
import com.codellege.hotel.service.HuespedServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/huespedes")
public class HuespedController {
    @Autowired
    private HuespedServiceImpl serviciosREST;
    @GetMapping
    public List<Huesped> listarTodo(){
        return serviciosREST.findAll();
    }
    @PostMapping
    public Huesped crear(@RequestBody Huesped huesped){
        return serviciosREST.save(huesped);
    }
    @PutMapping("{idHuesped}")
    public Huesped actualizar(@RequestBody Huesped huesped, @PathVariable Integer idHuesped){
        huesped.setIdHuesped(idHuesped);
        return serviciosREST.save(huesped);
    }
    @DeleteMapping("{idHuesped}")
    public void eliminar(@PathVariable Integer idHuesped){
        serviciosREST.deleteById(idHuesped);

    }

}
