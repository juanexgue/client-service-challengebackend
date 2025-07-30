package com.juanex.clienteservicechallengebackend.mapper;

import com.juanex.clienteservicechallengebackend.dto.ClienteDTO;
import com.juanex.clienteservicechallengebackend.model.Cliente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClienteMapper {
ClienteDTO toDTO(Cliente cliente);
Cliente to(ClienteDTO clienteDTO);
}
