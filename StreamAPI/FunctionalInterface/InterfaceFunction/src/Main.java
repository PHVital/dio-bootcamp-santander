import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> dobroNumeros = numeros.stream().map(n -> n * 2).toList();

        dobroNumeros.forEach(System.out::println);
    }
}