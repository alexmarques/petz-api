package br.com.petzapi.handler;

import br.com.petzapi.exceptions.ClienteNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ErrorHandler {

    @ExceptionHandler(ClienteNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public ValidationErrorResponse onClienteNotFoundException(ClienteNotFoundException e) {
        ValidationErrorResponse error = new ValidationErrorResponse();
        error.getErrors().add(new Error("clienteId", "clienteId [" + e.getClienteId() + "] não encontrado"));
        return error;
    }
}
