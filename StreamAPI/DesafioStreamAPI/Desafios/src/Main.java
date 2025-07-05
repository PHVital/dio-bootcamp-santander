import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        /*
        Desafio 1 - Mostre a lista na ordem numérica:
        Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console.
        */
        numeros.stream().sorted().forEach(n -> System.out.print(n + " "));

        /*
        Desafio 2 - Imprima a soma dos números pares da lista:
        Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.
        */
        System.out.println();
        int somaPares = numeros.stream().filter(n -> n % 2 == 0).reduce(0, Integer::sum);
        System.out.println(somaPares);

        /*
        Desafio 3 - Verifique se todos os números da lista são positivos:
        Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.
        */
        boolean positivos = numeros.stream().allMatch(n -> n > 0);
        System.out.println(positivos);

        /*
        Desafio 4 - Remova todos os valores ímpares:
        Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console.
        */
        numeros.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));

        /*
        Desafio 5 - Calcule a média dos números maiores que 5:
        Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
        */
        System.out.println();
        double media = numeros.stream().filter(n -> n > 5).collect(Collectors.averagingInt(Integer::intValue));
        System.out.println(media);

        /*
        Desafio 6 - Verificar se a lista contém algum número maior que 10:
        Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.
        */
        boolean maiorQue10 = numeros.stream().anyMatch(n -> n > 10);
        System.out.println("Maior que 10? " + maiorQue10);

        /*
        Desafio 7 - Encontrar o segundo número maior da lista:
        Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.
        */
        numeros.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().ifPresent(System.out::println);

        /*
        Desafio 8 - Somar os dígitos de todos os números da lista:
        Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.
        */
        int somaDigitos = numeros.stream().map(n -> String.valueOf(n).split("")).flatMap(Arrays::stream).mapToInt(Integer::parseInt).sum();
        System.out.println(somaDigitos);

        /*
        Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
        Com a Stream API, verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no console.
        */
        boolean todosDistintos = numeros.stream().distinct().count() == numeros.size();
        System.out.println(todosDistintos);

        /*
        Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
        Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.
        */
        List<Integer> multiplos3e5 = numeros.stream().filter(n -> n % 2 != 0 && (n % 3 == 0 || n % 5 == 0)).collect(Collectors.toList());
        System.out.println(multiplos3e5);

        /*
        Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
        Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console.
        */
        int somaQuadrados = numeros.stream().mapToInt(n -> n * n).sum();
        System.out.println(somaQuadrados);

        /*
        Desafio 12 - Encontre o produto de todos os números da lista:
        Com a ajuda da Stream API, encontre o produto de todos os números da lista e exiba o resultado no console.
        */
        System.out.println(numeros.stream().reduce(1, (n1, n2) -> n1 * n2));

        /*
        Desafio 13 - Filtrar os números que estão dentro de um intervalo:
        Utilize a Stream API para filtrar os números que estão dentro de um intervalo específico (por exemplo, entre 5 e 10) e exiba o resultado no console.
        */
        System.out.println(numeros.stream().filter(n -> n >= 5 && n <= 10).collect(Collectors.toList()));

        /*
        Desafio 14 - Encontre o maior número primo da lista:
        Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
        */
        System.out.println(numeros.stream().filter(Main::isPrimo).max(Integer::compare).orElse(-1));

        /*
        Desafio 15 - Verifique se a lista contém pelo menos um número negativo:
        Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo e exiba o resultado no console.
        */
        boolean temNegativo = numeros.stream().anyMatch(n -> n < 0);
        System.out.println("Contém número negativo? " + temNegativo);

        /*
        Desafio 16 - Agrupe os números em pares e ímpares:
        Utilize a Stream API para agrupar os números em duas listas separadas, uma contendo os números pares e outra contendo os números ímpares da lista original, e exiba os resultados no console.
        */
        Map<String, List<Integer>> agrupados = numeros.stream().collect(Collectors.groupingBy(n -> n % 2 == 0 ? "Pares" : "Impares"));
        System.out.println(agrupados);

        /*
        Desafio 17 - Filtrar os números primos da lista:
        Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.
        */
        System.out.println(numeros.stream().filter(Main::isPrimo).collect(Collectors.toList()));

        /*
        Desafio 18 - Verifique se todos os números da lista são iguais:
        Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.
        */
        boolean todosIguais = numeros.stream().distinct().count() == 1;
        System.out.println("Todos iguais? " + todosIguais);

        /*
        Desafio 19 - Encontre a soma dos números divisíveis por 3 e 5:
        Com a Stream API, encontre a soma dos números da lista que são divisíveis tanto por 3 quanto por 5 e exiba o resultado no console.
         */
        int somaMultiplos3e5 = numeros.stream().filter(n -> n % 3 == 0 || n % 5 == 0).mapToInt(Integer::intValue).sum();
        System.out.println(somaMultiplos3e5);

    }

    public static boolean isPrimo(int n) {
        if (n <= 1) return false;
        return IntStream.rangeClosed(2, (int) Math.sqrt(n)).noneMatch(i -> n % i == 0);
    }
}