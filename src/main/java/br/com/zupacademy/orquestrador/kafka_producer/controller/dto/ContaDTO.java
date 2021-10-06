package br.com.zupacademy.orquestrador.kafka_producer.controller.dto;

public class ContaDTO {

    private String numero;
    private ClienteDTO cliente;

    public ContaDTO(){
    }

    public ContaDTO( String numero, ClienteDTO cliente) {
        this.numero = numero;
        this.cliente = cliente;
    }

    public String getNumero() {
        return numero;
    }

    public ClienteDTO getCliente() {
        return cliente;
    }

}
