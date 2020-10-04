package br.com.petzapi.exceptions;

import lombok.Data;

@Data
public class ClienteNotFoundException extends RuntimeException {
    private final Long clienteId;
    public ClienteNotFoundException(Long clienteId) {
        this.clienteId = clienteId;
    }
}
