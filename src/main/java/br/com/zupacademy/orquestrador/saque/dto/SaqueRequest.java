package br.com.zupacademy.orquestrador.saque.dto;

import java.math.BigDecimal;

public class SaqueRequest {

    private Long idCliente;
    private String numConta;
    private BigDecimal valorSaque;

    public SaqueRequest(){
    }

    public SaqueRequest(Long idCliente, String numConta, BigDecimal valorSaque) {
        this.idCliente = idCliente;
        this.numConta = numConta;
        this.valorSaque = valorSaque;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public BigDecimal getValorSaque() {
        return valorSaque;
    }
}
