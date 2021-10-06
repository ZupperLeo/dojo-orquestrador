package br.com.zupacademy.orquestrador.kafka_producer.controller.dto;

public class ClienteDTO {

    private String nome;
    private String email;

    public ClienteDTO(){
    }

    public ClienteDTO( String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}
