package br.com.petzapi.converter;

import br.com.petzapi.models.Pet;
import br.com.petzapi.request.PetCreate;
import br.com.petzapi.response.PetResponse;

import java.io.PipedWriter;

public class PetConverter {

    public static PetResponse convert(Pet pet) {
        PetResponse response = new PetResponse();
        response.setId(pet.getId());
        response.setName(pet.getName());
        response.setType(pet.getType());
        return response;
    }

    public static Pet convert(PetCreate petCreate) {
        Pet pet = new Pet();
        pet.setName(petCreate.getName());
        pet.setType(petCreate.getType());
        return pet;
    }
}
