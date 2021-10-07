package br.com.zupacademy.orquestrador.shared.clients;

import br.com.zupacademy.orquestrador.deposito.dto.DepositaRequest;
import br.com.zupacademy.orquestrador.kafka_producer.controller.dto.ContaDTO;
import br.com.zupacademy.orquestrador.saque.dto.SaqueRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Component
@FeignClient(value="contaDigital", url="localhost:8080")
public interface ContaDigitalClient {

    @PostMapping("/contas/depositar")
    public ResponseEntity<ContaDTO> depositar(@RequestBody DepositaRequest depositaRequest);

    @PostMapping("/contas/sacar")
    public ResponseEntity<ContaDTO> sacar(@RequestBody SaqueRequest saqueRequest);

}
