package br.com.zupacademy.orquestrador.kafka_producer;

import br.com.zupacademy.orquestrador.kafka_producer.controller.dto.TransacaoDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class TransacoesProducer {

    private static final Logger LOGGER = LoggerFactory.getLogger(TransacoesProducer.class);
    private final String topic;
    private final KafkaTemplate<String, TransacaoDTO> kafkaTemplate;

    public TransacoesProducer(@Value("${topic.name}") String topic, KafkaTemplate<String, TransacaoDTO> kafkaTemplate) {
        this.topic = topic;
        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(TransacaoDTO topicNameDTO){
        kafkaTemplate.send(topic, topicNameDTO).addCallback(
                success -> LOGGER.info("Mensagem enviada: " + success.getProducerRecord().value()),
                failure -> LOGGER.info("Falha ao enviar mensagem: " + failure.getMessage())
        );
    }
}
