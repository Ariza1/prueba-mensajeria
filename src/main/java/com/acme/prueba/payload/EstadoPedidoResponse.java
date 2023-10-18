package com.acme.prueba.payload;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@Data
@AllArgsConstructor
public class EstadoPedidoResponse {
    private String codigoEnvio;
    private String estado;
}
