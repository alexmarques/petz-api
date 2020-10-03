package br.com.petzapi.services;

import br.com.petzapi.models.Pet;

public interface PetService {
    Pet save(Pet pet);
    void delete(Long id);
}
