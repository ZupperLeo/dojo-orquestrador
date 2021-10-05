package br.com.zupacademy.orquestrador.kafka_producer.controller.dto;

import java.math.BigDecimal;

public class ContaDTO {

    private Long id;
    private String numero;
    private ClienteDTO cliente;

    public ContaDTO(){
    }

    public ContaDTO(Long id, String numero, ClienteDTO cliente) {
        this.id = id;
        this.numero = numero;
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public String getNumero() {
        return numero;
    }

    public ClienteDTO getCliente() {
        return cliente;
    }

}
