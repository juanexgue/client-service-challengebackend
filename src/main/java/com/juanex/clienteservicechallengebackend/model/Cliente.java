package com.juanex.clienteservicechallengebackend.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="clientes")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codigoUnico;
    private String nombres;
    private String apellidos;
    private String tipoDocumento;
    private String numeroDocumento;

   }
