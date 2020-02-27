package br.com.indra.microservices.netflixzuulapigetwayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
//habilitando o zuul
@EnableZuulProxy
//buscando pelo pacote que eureka foi habilitada
@EnableDiscoveryClient
@SpringBootApplication
public class NetflixZuulApiGetwayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixZuulApiGetwayServerApplication.class, args);
	}

}
