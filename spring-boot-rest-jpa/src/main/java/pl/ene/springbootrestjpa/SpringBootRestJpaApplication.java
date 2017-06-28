package pl.ene.springbootrestjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import pl.ene.springbootrestjpa.config.PersistenceConfig;
//comment on b1
@EnableAutoConfiguration
@SpringBootApplication
@Import(PersistenceConfig.class)
public class SpringBootRestJpaApplication {

	public static void main(String[] args) {
				
		SpringApplication.run(SpringBootRestJpaApplication.class);
		
	}
//2 commit b1
}
