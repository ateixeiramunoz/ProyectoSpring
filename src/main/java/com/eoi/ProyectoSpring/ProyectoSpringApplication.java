package com.eoi.ProyectoSpring;

import com.eoi.ProyectoSpring.models.Address;
import com.eoi.ProyectoSpring.models.Customer;
import com.eoi.ProyectoSpring.repositories.AddressRepository;
import com.eoi.ProyectoSpring.repositories.CustomerRepository;
import org.apache.hc.core5.reactor.Command;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;
import java.time.LocalDate;

@SpringBootApplication
public class ProyectoSpringApplication implements CommandLineRunner {

	@Autowired
	CustomerRepository customerRepository;
	@Autowired
	AddressRepository addressRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Customer customer = new Customer("Jebediah","Kerman","The First", Date.valueOf(LocalDate.of( 1982 , 5 , 9 )));
		customerRepository.save(customer);
		Address	address = new Address("Calle Carcalacueva", "JACA", "HUESCA", "22700");
		address.setCustomer(customer);
		addressRepository.save(address);

	}
}
