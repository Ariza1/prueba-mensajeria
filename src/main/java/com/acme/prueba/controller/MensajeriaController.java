package com.acme.prueba.controller;

import com.acme.prueba.payload.EstadoPedidoDto;
import com.acme.prueba.payload.EstadoPedidoResponse;
import com.acme.prueba.payload.PedidoDto;
import com.acme.prueba.payload.PedidoResponse;
import jakarta.validation.Valid;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class MensajeriaController {
    @PostMapping(value = "/mensajeria",
            produces = {MediaType.APPLICATION_XML_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE}
    )
    public ResponseEntity<PedidoResponse> postMensajeria(@RequestBody @Valid PedidoDto pedido) {
        return ResponseEntity.ok(
                PedidoResponse.builder()
                        .pedido(pedido.getNumPedido())
                        .cantidad(pedido.getCantidadPedido())
                        .EAN(pedido.getCodigoEAN())
                        .producto(pedido.getNombreProducto())
                        .cedula(pedido.getNumDocumento())
                        .direccion(pedido.getDireccion())
                        .build()
        );
    }

    @PostMapping(value = "/estado",
            consumes = {MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public ResponseEntity<EstadoPedidoResponse> postEstado(@RequestBody @Valid EstadoPedidoDto estadoPedidoDto) {
        return ResponseEntity.ok(
                EstadoPedidoResponse.builder()
                        .codigoEnvio(estadoPedidoDto.getCodigo())
                        .estado(estadoPedidoDto.getMensaje())
                        .build()
        );
    }
}
