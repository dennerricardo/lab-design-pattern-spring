package dio.study.lab_design_pattern_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
/**
 * Projeto Spring Boot gerado via Spring Initializr.
 * Os seguintes módulos foram selecionados:
 * - Spring Data JPA
 * - Spring Web
 * - H2 Database
 * - OpenFeign
 *
 * @author falvojr
 */
@EnableFeignClients
@SpringBootApplication
public class LabDesignPatternSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabDesignPatternSpringApplication.class, args);
	}

}
