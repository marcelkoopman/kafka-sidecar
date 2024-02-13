package sidecar.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigLoader {

    public Properties loadProducerProperties() throws IOException{
      var properties = new Properties();
      try (FileInputStream fis = new FileInputStream("producer.properties")) {
         properties.load(fis);
      }
      return properties;
    }
}
