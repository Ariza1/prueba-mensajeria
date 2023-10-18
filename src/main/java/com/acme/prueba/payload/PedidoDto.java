package com.acme.prueba.payload;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PedidoDto {
    @NotBlank(message = "numero de pedido is required")
    private String numPedido;
    @NotBlank(message = "cantidadPedido is required")
    private String cantidadPedido;
    @NotBlank(message = "codigoEAN is required")
    private String codigoEAN;
    @NotBlank(message = "nombreProducto is required")
    private String nombreProducto;
    @NotBlank(message = "numDocumento is required")
    private String numDocumento;
    @NotBlank(message = "direccion is required")
    private String direccion;
}
