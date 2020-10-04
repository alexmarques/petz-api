package br.com.petzapi.response;

import lombok.Data;

import java.util.List;

@Data
public class ClienteResponse {

    private Long id;
    private String name;
    private List<PetResponse> pets;

}
