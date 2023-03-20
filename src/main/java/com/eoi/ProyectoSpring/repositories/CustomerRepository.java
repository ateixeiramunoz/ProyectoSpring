package com.eoi.ProyectoSpring.repositories;
import com.eoi.ProyectoSpring.models.Customer;
import org.springframework.data.repository.CrudRepository;

/**
 * The interface Repositorio de clientes.
 */
// This will be AUTO IMPLEMENTED by Spring into a Bean called customerRepository
// CRUD refers Create, Read, Update, Delete
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}