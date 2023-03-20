package com.eoi.ProyectoSpring.repositories;

import com.eoi.ProyectoSpring.models.Address;
import org.springframework.data.repository.CrudRepository;

/**
 * The interface Repositorio de clientes.
 */
// This will be AUTO IMPLEMENTED by Spring into a Bean called addressRepository
// CRUD refers Create, Read, Update, Delete
public interface AddressRepository extends CrudRepository<Address, Integer> {

}