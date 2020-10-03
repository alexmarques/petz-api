package br.com.petzapi.controllers;

import br.com.petzapi.models.Cliente;
import br.com.petzapi.services.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public List<Cliente> getAll() {
        return this.service.findAll();
    }
}
