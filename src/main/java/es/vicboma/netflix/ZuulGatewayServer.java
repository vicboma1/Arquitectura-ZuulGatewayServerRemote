package es.vicboma.netflix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication   // Arranque autónomo del microservicio
@EnableDiscoveryClient   // Descubrimiento para registrarse en Eureka
@EnableZuulProxy         // Servicio basado en Zuul
public class ZuulGatewayServer {

  /**
   * Constructor
   * @param args
   */
  public static void main(String[] args) {
    SpringApplication.run(ZuulGatewayServer.class, args);
  }

}