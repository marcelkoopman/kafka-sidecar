package sidecar.adapter.kafka.produce;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import java.util.Properties;
import org.apache.kafka.clients.producer.KafkaProducer;

public class KafkaProducerFactory {
    private static final Logger LOG = LoggerFactory.getLogger(KafkaProducerFactory.class);
    public KafkaProducer create(Properties properties) {
        LOG.info("Creating producer from properties");
        var producer = new KafkaProducer<>(properties);
        return producer;
    }
}