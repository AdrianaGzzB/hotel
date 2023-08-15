package com.codellege.hotel.controller;
import com.codellege.hotel.model.Reserva;
import com.codellege.hotel.service.ReservaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/v1/reservas")

public class ReservaController {
        @Autowired
        private ReservaServiceImpl servicioREST;
        @GetMapping
        public List<Reserva> listarReservaciones(){
            return servicioREST.findAll();
        }
        @PostMapping
        public Reserva crearReservaciones(Reserva reserva){
            return servicioREST.save(reserva);
        }

        @PutMapping("{idReserva}")
        public Reserva actualizarReservaciones(@RequestBody Reserva reserva, @PathVariable Integer idReserva){
            //reserva.setIdReserva(idReserva);
            return servicioREST.save(idReserva, reserva);
        }
        @DeleteMapping("{idReserva}")
        public void eliminarReservaciones(@PathVariable Integer idReserva){
            servicioREST.deleteById(idReserva);

        }

    }
