package com.codellege.hotel.repository;

import com.codellege.hotel.model.Reserva;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IReservaRepo extends JpaRepository<Reserva, Integer> {
    void deleteById(Integer idReserva);
}
