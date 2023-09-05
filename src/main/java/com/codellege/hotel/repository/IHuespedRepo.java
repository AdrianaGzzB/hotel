package com.codellege.hotel.repository;

import com.codellege.hotel.model.Huesped;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHuespedRepo extends JpaRepository<Huesped, Integer >{
    //void deleteById(Integer idHuesped);
}
