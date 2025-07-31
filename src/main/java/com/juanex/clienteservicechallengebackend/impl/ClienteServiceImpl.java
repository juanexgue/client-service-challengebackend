package com.juanex.clienteservicechallengebackend.impl;

import com.juanex.clienteservicechallengebackend.dto.ClienteDTO;
import com.juanex.clienteservicechallengebackend.mapper.ClienteMapper;
import com.juanex.clienteservicechallengebackend.repository.ClienteRepository;
import com.juanex.clienteservicechallengebackend.service.ClienteService;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService {
 private ClienteRepository repository;
 private ClienteMapper mapper;

    public ClienteServiceImpl(ClienteRepository repository, ClienteMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public ClienteDTO obtenerPorCodigoUnico(String codigoEncriptado) {
        return repository.findByCodigoUnico(codigoEncriptado)
                .map(mapper::entityToDTO)
                .orElseThrow(() -> new RuntimeException("Cliente no encontrado"));
    }
}
