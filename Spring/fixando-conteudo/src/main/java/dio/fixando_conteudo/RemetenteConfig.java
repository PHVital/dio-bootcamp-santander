package dio.fixando_conteudo;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "app.remetente")
public record RemetenteConfig(String nome, String email) {
}
