package br.com.petzapi;

import br.com.petzapi.models.Cliente;
import br.com.petzapi.models.Pet;
import br.com.petzapi.models.PetType;
import br.com.petzapi.repository.ClienteRepository;
import br.com.petzapi.repository.PetRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class PetzApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(PetzApiApplication.class, args);
    }

    @Bean
    public CommandLineRunner cadastrarCliente(ClienteRepository clienteRepository,
                                              PetRepository petRepository) {
        return args -> {
            Cliente cliente = new Cliente();
            cliente.setName("Alex");
            Pet pet = new Pet();
            pet.setName("Bob");
            pet.setType(PetType.CACHORRO);
            Pet petSaved = petRepository.save(pet);
            cliente.setPets(Arrays.asList(petSaved));
            Cliente clienteSaved = clienteRepository.save(cliente);
            petSaved.setClienteId(clienteSaved.getId());
            petRepository.save(petSaved);
        };
    }

}
