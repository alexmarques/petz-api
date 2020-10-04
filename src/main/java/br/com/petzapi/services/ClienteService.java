package br.com.petzapi.services;

import br.com.petzapi.models.Cliente;
import br.com.petzapi.models.Pet;

import java.util.List;

public interface ClienteService {

    Cliente save(Cliente cliente);
    void delete(Long id);
    List<Cliente> findAll();
    List<Pet> getPets(Long clienteId);
    Cliente findById(Long clienteId);
}
