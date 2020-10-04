package br.com.petzapi.controllers;

import br.com.petzapi.converter.ClienteConverter;
import br.com.petzapi.converter.PetConverter;
import br.com.petzapi.models.Cliente;
import br.com.petzapi.response.ClienteResponse;
import br.com.petzapi.response.PetResponse;
import br.com.petzapi.services.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @PostMapping
    public Cliente cadastrar(@RequestBody Cliente cliente) {
        return this.service.save(cliente);
    }

    @GetMapping
    public List<ClienteResponse> getAll() {
        return this.service.findAll()
                .stream()
                .map(ClienteConverter::convert)
                .collect(Collectors.toList());
    }

    @GetMapping("/{clienteId}/pets")
    public List<PetResponse> getPets(@PathVariable Long clienteId) {
        return this.service.getPets(clienteId)
                .stream()
                .map(PetConverter::convert)
                .collect(Collectors.toList());
    }

    @GetMapping("/{clienteId}")
    public ClienteResponse getById(@PathVariable Long clienteId) {
        Cliente cliente = this.service.findById(clienteId);
        return ClienteConverter.convert(cliente);
    }
}
