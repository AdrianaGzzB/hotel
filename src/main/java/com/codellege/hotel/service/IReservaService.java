package com.codellege.hotel.service;

import java.util.List;

public interface IReservaService<Reserva, Integer> {
    //GET
    List<Reserva> findAll();
    //POST
    Reserva save(Reserva reserva);
    //PUT
    Reserva save(Integer idReserva, Reserva reserva);

    //DELETE
    void  deleteById(Integer idReserva);
}
