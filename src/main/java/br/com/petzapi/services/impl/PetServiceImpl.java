package br.com.petzapi.services.impl;

import br.com.petzapi.models.Pet;
import br.com.petzapi.repository.PetRepository;
import br.com.petzapi.services.PetService;
import org.springframework.stereotype.Service;

@Service
public class PetServiceImpl implements PetService {

    private final PetRepository repository;

    public PetServiceImpl(PetRepository repository) {
        this.repository = repository;
    }

    @Override
    public Pet save(Pet pet) {
        return this.repository.save(pet);
    }

    @Override
    public void delete(Long id) {
        this.repository.deleteById(id);
    }
}
