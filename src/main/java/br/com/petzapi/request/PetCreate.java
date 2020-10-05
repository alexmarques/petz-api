package br.com.petzapi.request;

import br.com.petzapi.models.PetType;
import lombok.Data;

@Data
public class PetCreate {
    private String name;
    private PetType type;
}
