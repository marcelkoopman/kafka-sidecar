package sidecar;

import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.util.Properties;

import org.slf4j.Logger;
import sidecar.adapter.kafka.produce.KafkaProducerFactory;
import sidecar.config.ConfigLoader;

public class Main {
   private static final Logger LOG 
      = LoggerFactory.getLogger(Main.class);

   public static void main(String[] args) throws Exception{
      LOG.info("Sidecar started");
      var factory = new KafkaProducerFactory();
      var properties = new ConfigLoader().loadProducerProperties();
      var producer = factory.create(properties);
      LOG.info("Created producer {}", producer);
      LOG.info("Sidecar stopped.");
   }
}
