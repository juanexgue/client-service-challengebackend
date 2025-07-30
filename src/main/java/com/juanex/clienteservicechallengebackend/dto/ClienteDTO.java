package com.juanex.clienteservicechallengebackend.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClienteDTO {

    private String nombres;
    private String apellidos;
    private String tipoDocumento;
    private String numeroDocumento;
}
