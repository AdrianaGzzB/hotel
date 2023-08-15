package com.codellege.hotel.service;

import com.codellege.hotel.model.Huesped;
import com.codellege.hotel.model.Reserva;
import com.codellege.hotel.repository.IHuespedRepo;
import com.codellege.hotel.repository.IReservaRepo;

import java.util.List;

public class ReservaServiceImpl implements IReservaService<Reserva, Integer> {
    private IReservaRepo repository;

    @Override
    public List<Reserva> findAll() {
        return repository.findAll();
    }

    @Override
    public Reserva save(Reserva reserva) {
        return repository.save(reserva);
    }

    public Reserva save(Integer idReserva, Reserva reserva) {
        reserva.setIdReserva(idReserva);
        return repository.save(reserva);
    }

    @Override
    public void deleteById(Integer idReserva) {
        repository.deleteById(idReserva);
    }
}
