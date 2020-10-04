package br.com.petzapi.converter;

import br.com.petzapi.models.Pet;
import br.com.petzapi.response.PetResponse;

public class PetConverter {

    public static PetResponse convert(Pet pet) {
        PetResponse response = new PetResponse();
        response.setId(pet.getId());
        response.setName(pet.getName());
        response.setType(pet.getType());
        return response;
    }
}
