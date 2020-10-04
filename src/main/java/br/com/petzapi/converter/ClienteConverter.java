package br.com.petzapi.converter;

import br.com.petzapi.models.Cliente;
import br.com.petzapi.response.ClienteResponse;
import br.com.petzapi.response.PetResponse;

import java.util.List;
import java.util.stream.Collectors;

public class ClienteConverter {
    public static ClienteResponse convert(Cliente cliente) {
        ClienteResponse response = new ClienteResponse();
        response.setId(cliente.getId());
        response.setName(cliente.getName());
        List<PetResponse> pets = cliente.getPets()
                .stream()
                .map(PetConverter::convert)
                .collect(Collectors.toList());
        response.setPets(pets);
        return response;
    }
}
