package com.codellege.hotel.service;

import com.codellege.hotel.model.Huesped;
import com.codellege.hotel.repository.IHuespedRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HuespedServiceImpl implements IHuespedService<Huesped, Integer> {
    @Autowired
    private IHuespedRepo repository;
    @Override
    public List<Huesped> findAll() {
        return repository.findAll();
    }

    @Override
    public Huesped save(Huesped huesped) {
        return repository.save(huesped);
    }

    @Override
    public Huesped save(Integer idHuesped, Huesped huesped) {
        huesped.setIdHuesped(idHuesped);
        return repository.save(huesped);
    }

    @Override
    public void deleteById(Integer idHuesped) {
     repository.deleteById(idHuesped);
    }
}
