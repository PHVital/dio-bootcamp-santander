import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> linguagens = Arrays.asList("java", "kotlin", "python", "c", "javascript", "ruby");
        linguagens.stream().filter(p -> p.length() > 5).forEach(System.out::println);
    }
}