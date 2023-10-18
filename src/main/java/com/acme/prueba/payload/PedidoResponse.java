package com.acme.prueba.payload;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@Data
@AllArgsConstructor
public class PedidoResponse {
    private String pedido;
    private String cantidad;
    private String EAN;
    private String producto;
    private String cedula;
    private String direccion;
}
