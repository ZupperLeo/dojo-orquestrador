package br.com.zupacademy.orquestrador.kafka_producer.controller.dto;

import br.com.zupacademy.orquestrador.shared.enums.Operadoras;

public class CelularDTO {

    private String numero;
    private Operadoras operadora;

    public CelularDTO(){
    }

    public CelularDTO(String numero, Operadoras operadora) {
        this.numero = numero;
        this.operadora = operadora;
    }

    public String getNumero() {
        return numero;
    }

    public Operadoras getOperadora() {
        return operadora;
    }
}
