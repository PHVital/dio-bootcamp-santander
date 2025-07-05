import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> listaSaudacao = Stream.generate(() -> "Olá, seja bem-vindo!").limit(5).toList();

        listaSaudacao.forEach(System.out::println);
    }
}