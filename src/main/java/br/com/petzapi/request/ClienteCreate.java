package br.com.petzapi.request;

import lombok.Data;

import java.util.List;

@Data
public class ClienteCreate {
    private String name;
    private List<PetCreate> pets;
}
