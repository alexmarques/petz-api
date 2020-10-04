package br.com.petzapi.response;

import br.com.petzapi.models.PetType;
import lombok.Data;

@Data
public class PetResponse {
    private Long id;
    private String name;
    private PetType type;
}
