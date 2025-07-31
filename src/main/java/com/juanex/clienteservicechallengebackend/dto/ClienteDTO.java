package com.juanex.clienteservicechallengebackend.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ClienteDTO {

    private String nombres;
    private String apellidos;
    private String tipoDocumento;
    private String numeroDocumento;
}
