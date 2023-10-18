package com.acme.prueba.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EstadoPedidoDto {
    private String codigo;
    private String mensaje;
}
