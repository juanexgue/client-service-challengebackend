package com.juanex.clienteservicechallengebackend.service.impl;

import com.juanex.clienteservicechallengebackend.dto.ClienteDTO;
import com.juanex.clienteservicechallengebackend.exeption.ClienteNoEncontradoException;
import com.juanex.clienteservicechallengebackend.mapper.ClienteMapper;
import com.juanex.clienteservicechallengebackend.repository.ClienteRepository;
import com.juanex.clienteservicechallengebackend.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClienteServiceImpl implements ClienteService {
 private final ClienteRepository repository;
 private final ClienteMapper mapper;

    @Override
    public ClienteDTO obtenerPorCodigoUnico(String codigoEncriptado) {
        return repository.findByCodigoUnico(codigoEncriptado)
                .map(mapper::entityToDTO)
                .orElseThrow(() -> new ClienteNoEncontradoException("Cliente no encontrado"));
    }
}
