package br.com.zupacademy.orquestrador.kafka_producer.controller.dto;

public class ContaDTO {

    private String numero;
    private ClienteDTO clienteDTO;

    public ContaDTO(){
    }

    public ContaDTO( String numero, ClienteDTO cliente) {
        this.numero = numero;
        this.clienteDTO = cliente;
    }

    public String getNumero() {
        return numero;
    }

    public ClienteDTO getClienteDTO() {
        return clienteDTO;
    }

}
