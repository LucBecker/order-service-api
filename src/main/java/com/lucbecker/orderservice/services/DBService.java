package com.lucbecker.orderservice.services;

import com.lucbecker.orderservice.domain.Cliente;
import com.lucbecker.orderservice.domain.OS;
import com.lucbecker.orderservice.domain.Tecnico;
import com.lucbecker.orderservice.domain.enums.Prioridade;
import com.lucbecker.orderservice.domain.enums.Status;
import com.lucbecker.orderservice.repositories.ClienteRepository;
import com.lucbecker.orderservice.repositories.OSRepository;
import com.lucbecker.orderservice.repositories.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private TecnicoRepository tecnicoRepository;
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private OSRepository osRepository;
    public void instanciaDB() {

        Tecnico t1 = new Tecnico(null, "Lucas Becker", "911.836.820-42", "(88) 98888-8888");
        Cliente c1 = new Cliente(null, "Betina Campos", "936.792.010-52", "(88) 98888-7777");

        OS os1 = new OS(null, Prioridade.ALTA, "Trocar fonte do notebook", Status.ANDAMENTO, t1, c1);

        tecnicoRepository.saveAll(Arrays.asList(t1));
        clienteRepository.saveAll(Arrays.asList(c1));
        osRepository.saveAll(Arrays.asList(os1));
    }
}
