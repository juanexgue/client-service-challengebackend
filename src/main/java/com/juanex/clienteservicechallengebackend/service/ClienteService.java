package com.juanex.clienteservicechallengebackend.service;

import com.juanex.clienteservicechallengebackend.dto.ClienteDTO;

public interface ClienteService {
    ClienteDTO obtenerPorCodigoUnico(String codigo);
}
