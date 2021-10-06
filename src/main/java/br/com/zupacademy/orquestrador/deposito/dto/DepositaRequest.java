package br.com.zupacademy.orquestrador.deposito.dto;

import java.math.BigDecimal;

public class DepositaRequest {

    private String numConta;
    private BigDecimal valorDeposito;

    @Deprecated
    public DepositaRequest() {
    }

    public DepositaRequest( String numConta, BigDecimal valorDeposito) {
        this.numConta = numConta;
        this.valorDeposito = valorDeposito;
    }

    public String getNumConta() {
        return numConta;
    }

    public BigDecimal getValorDeposito() {
        return valorDeposito;
    }
}
