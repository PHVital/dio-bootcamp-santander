package dio.fixando_conteudo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(RemetenteConfig.class)
public class FixandoConteudoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FixandoConteudoApplication.class, args);
	}

}
