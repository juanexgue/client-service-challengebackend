package com.juanex.clienteservicechallengebackend.controller;

import com.juanex.clienteservicechallengebackend.dto.ClienteDTO;
import com.juanex.clienteservicechallengebackend.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
    private final ClienteService clienteService;

    @GetMapping("/{codigoUnico}")
    public ClienteDTO obtenerCliente(@PathVariable String codigoUnico) {
        return clienteService.obtenerPorCodigoUnico(codigoUnico);
    }
}
