import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("A soma é: " + numeros.stream().reduce(0, Integer::sum));
    }
}