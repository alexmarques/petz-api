package br.com.petzapi.services;

import br.com.petzapi.exceptions.ClienteNotFoundException;
import br.com.petzapi.models.Cliente;
import br.com.petzapi.models.Pet;
import br.com.petzapi.repository.ClienteRepository;
import br.com.petzapi.repository.PetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository repository;
    private final PetRepository petRepository;

    public ClienteServiceImpl(ClienteRepository repository, PetRepository petRepository) {
        this.repository = repository;
        this.petRepository = petRepository;
    }

    @Override
    public Cliente save(Cliente cliente) {
        return this.repository.save(cliente);
    }

    @Override
    public void delete(Long id) {
        this.repository.deleteById(id);
    }

    @Override
    public List<Cliente> findAll() {
        return this.repository.findAll();
    }

    @Override
    public List<Pet> getPets(Long clienteId) {
        return this.petRepository.findAllByClienteId(clienteId);
    }

    @Override
    public Cliente findById(Long clienteId) {
        return this.repository.findById(clienteId)
                .orElseThrow(() -> new ClienteNotFoundException(clienteId));
    }
}
