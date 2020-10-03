package br.com.petzapi.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
public class Pet {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private PetType type;
    private Long clienteId;
}
