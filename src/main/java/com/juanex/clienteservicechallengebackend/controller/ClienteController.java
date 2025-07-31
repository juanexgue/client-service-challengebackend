package com.juanex.clienteservicechallengebackend.controller;

import com.juanex.clienteservicechallengebackend.dto.ClienteDTO;
import com.juanex.clienteservicechallengebackend.service.ClienteService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("/{codigoUnico}")
    public ClienteDTO obtenerCliente(@PathVariable String codigoUnico) {
        return clienteService.obtenerPorCodigoUnico(codigoUnico);
    }
}
