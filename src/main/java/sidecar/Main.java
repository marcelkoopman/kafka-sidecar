package sidecar;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import sidecar.adapter.kafka.produce.KafkaProducerFactory;

public class Main {
   private static final Logger LOG 
      = LoggerFactory.getLogger(Main.class);

   public static void main(String[] args) {
      LOG.info("Sidecar started");
      var factory = new KafkaProducerFactory();
      var producer = factory.create(null);
      LOG.info("Created producer {}", producer);
      LOG.info("Sidecar stopped.");
   }
}
