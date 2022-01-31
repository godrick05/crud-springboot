package br.com.henriquecunha.springbootcommysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
	//scanBasePackges ele vai ajudar a encontrar outros pontos de configuração no sistema
@SpringBootApplication(scanBasePackages = "br.com.henriquecunha.springbootcommysql")
//EntitiScan scanei os modelos de JPA[
@EntityScan(basePackages = "br.com.rodrigorahman.springbootcommysql.model")
public class SpringBootComMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootComMysqlApplication.class, args);
	}

}
