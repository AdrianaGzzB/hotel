package com.codellege.hotel.service;

import java.util.List;

public interface IHuespedService<Huesped, Integer>{
    //4 metodos de http: GET, POST, PUT & DELETE

    //GET
    List<Huesped> findAll();
    //POST
    Huesped save(Huesped huesped);
    //PUT
    Huesped save(Integer idHuesped, Huesped huesped);

    //DELETE
    void  deleteById(Integer idHuesped);

}
