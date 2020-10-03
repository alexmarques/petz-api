package br.com.petzapi.controllers;

import br.com.petzapi.models.Pet;
import br.com.petzapi.services.PetService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pets")
public class PetController {

    private final PetService service;

    public PetController(PetService service) {
        this.service = service;
    }

    @PostMapping
    public Pet save(@RequestBody Pet pet) {
        return this.service.save(pet);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.service.delete(id);
    }
}
