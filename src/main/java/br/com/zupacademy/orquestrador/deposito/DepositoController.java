package br.com.zupacademy.orquestrador.deposito;

import br.com.zupacademy.orquestrador.deposito.dto.DepositaRequest;
import br.com.zupacademy.orquestrador.kafka_producer.TransacoesProducer;
import br.com.zupacademy.orquestrador.kafka_producer.controller.dto.ContaDTO;
import br.com.zupacademy.orquestrador.kafka_producer.controller.dto.TransacaoDTO;
import br.com.zupacademy.orquestrador.shared.clients.ContaDigitalClient;
import br.com.zupacademy.orquestrador.shared.enums.TipoOperacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepositoController {

    @Autowired
    private ContaDigitalClient client;

    @Autowired
    private TransacoesProducer transacoesProducer;

    @PostMapping("/contas/depositar")
    public ResponseEntity<?> depositar( @RequestBody DepositaRequest depositaRequest){

        ResponseEntity<?> response = client.depositar(depositaRequest);
        if(response.getStatusCode() != HttpStatus.OK){
            throw new RuntimeException("teste");
        }

        ContaDTO contaDTO = (ContaDTO) response.getBody();

        TransacaoDTO transacaoDTO = new TransacaoDTO(
                TipoOperacao.DEPOSITO,
                depositaRequest.getValorDeposito(),
                contaDTO);

        transacoesProducer.send(transacaoDTO);

        return ResponseEntity.ok().body(transacaoDTO);
    }
}
