package com.lucbecker.orderservice.services;

import com.lucbecker.orderservice.domain.OS;
import com.lucbecker.orderservice.repositories.OSRepository;
import com.lucbecker.orderservice.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OsService {

    @Autowired
    private OSRepository repository;

    public OS findById(Integer id){
        Optional<OS> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: "+ OS.class.getName()));
    }
}
