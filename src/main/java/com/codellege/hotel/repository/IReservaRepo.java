package com.codellege.hotel.repository;

import com.codellege.hotel.model.Reservas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IReservasRepo extends JpaRepository<Reservas Integer> {
}
