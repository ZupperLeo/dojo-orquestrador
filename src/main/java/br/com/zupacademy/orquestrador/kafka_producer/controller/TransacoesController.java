package br.com.zupacademy.orquestrador.kafka_producer.controller;

import br.com.zupacademy.orquestrador.kafka_producer.TransacoesProducer;
import br.com.zupacademy.orquestrador.kafka_producer.controller.dto.TransacaoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transacoes")
public class TransacoesController {

    @Autowired
    private TransacoesProducer transacoesProducer;

    @PostMapping
    public ResponseEntity<TransacaoDTO> create(@RequestBody TransacaoDTO transacaoeDTO){
        transacoesProducer.send(transacaoeDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(transacaoeDTO);
    }
}
