package com.thales.usuario.Business.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TelefoneDTO {


    private Long id;
    private String numero;
    private String ddd;
}
