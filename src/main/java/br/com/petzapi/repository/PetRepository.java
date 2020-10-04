package br.com.petzapi.repository;

import br.com.petzapi.models.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PetRepository extends JpaRepository<Pet, Long> {
    List<Pet> findAllByClienteId(Long clienteId);
}
