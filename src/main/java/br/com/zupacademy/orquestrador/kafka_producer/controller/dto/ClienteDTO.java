package br.com.zupacademy.orquestrador.kafka_producer.controller.dto;

public class ClienteDTO {

    private Long id;
    private String nome;
    private String email;

    public ClienteDTO(){
    }

    public ClienteDTO(Long id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}
