package com.lucbecker.orderservice;

import com.lucbecker.orderservice.domain.Cliente;
import com.lucbecker.orderservice.domain.OS;
import com.lucbecker.orderservice.domain.Tecnico;
import com.lucbecker.orderservice.domain.enums.Prioridade;
import com.lucbecker.orderservice.domain.enums.Status;
import com.lucbecker.orderservice.repositories.ClienteRepository;
import com.lucbecker.orderservice.repositories.OSRepository;
import com.lucbecker.orderservice.repositories.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class OrderServiceApplication implements CommandLineRunner {

	@Autowired
	private TecnicoRepository tecnicoRepository;

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private OSRepository osRepository;

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Tecnico t1 = new Tecnico(null, "Lucas Becker", "911.836.820-42", "(88) 98888-8888" );
		Cliente c1 = new Cliente(null, "Betina Campos", "936.792.010-52", "(88) 98888-7777");

		OS os1 = new OS(null, Prioridade.ALTA, "Teste create OS", Status.ANDAMENTO, t1, c1 );

		t1.getList().add(os1);
		c1.getList().add(os1);

		tecnicoRepository.saveAll(Arrays.asList(t1));
		clienteRepository.saveAll(Arrays.asList(c1));
		osRepository.saveAll(Arrays.asList(os1));
	}
}
