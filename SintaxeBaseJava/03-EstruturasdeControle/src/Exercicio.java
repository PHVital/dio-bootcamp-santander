package src.SintaxeBaseJava.EstruturasdeControles;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        /*
        1. Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;
        2. Escreva um código onde o usuário entra com sua altura e peso, seja feito o calculo do seu IMC(IMC = peso/(altura * altura))
         e seja exibida a mensagem de acordo com o resultado:
            Se for menor ou igual a 18,5 "Abaixo do peso";
            se for entre 18,6 e 24,9 "Peso ideal";
            Se for entre 25,0 e 29,9 "Levemente acima do peso";
            Se for entre 30,0 e 34,9 "Obesidade Grau I";
            Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
            Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";
        3. Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro e escolhe entre a opção
        par e impar, com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial) no intervalo de
        números informados, incluindo os números informados e em ordem decrescente;
        4. Escreva um código onde o usuário informa um número inicial, posteriormente irá informar outros N números, a execução do código
        irá continuar até que o número informado dividido pelo primeiro número tenha resto diferente de 0 na divisão, números menores que
         o primeiro número devem ser ignorados
        */

        var scanner = new Scanner(System.in);
        /*
        // Exercicio 1
        System.out.println("Digite um número: ");
        var n = scanner.nextInt();
        for (var i = 1; i <= n; i++) {
            System.out.println(i + " * " + n + " = " + n*i);
        }

        // Exercicio 2
        System.out.println("Digite sua altura (m) e peso (Kg): ");
        var altura = scanner.nextDouble();
        var peso = scanner.nextDouble();
        var imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc < 24.9) {
            System.out.println("Peso ideal");
        } else if (imc < 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (imc < 34.9) {
            System.out.println("Obesidade Grau I");
        } else if (imc < 39.9) {
            System.out.println("Obesidade Grau II (severa)");
        } else if (imc < 40.0) {
            System.out.println("Obesidade Grau III (mórbida)");
        }

        // Exercicio 3
        System.out.println("Digite um range entre dois números: ");
        var n1 = scanner.nextInt();
        var n2 = scanner.nextInt();
        System.out.println("Escolha entre Par ou Impar (0 / 1): ");
        var pi = scanner.nextInt();
        if (pi == 0) {
            while (n2 > n1) {
                if (n2 % 2 == 0) {
                    System.out.println(n2);
                }
                n2--;
            }
        } else {
            while (n2 > n1) {
                if (n2 % 2 != 0) {
                    System.out.println(n2);
                }
                n2--;
            }
        }*/

        // Exercicio 4
        int inicial, outro;
        System.out.println("Digite um numero inicial: ");
        inicial = scanner.nextInt();
        while(true) {
            System.out.println("Digite um outro numero: ");
            outro = scanner.nextInt();
            if (outro < inicial) {
                System.out.println("Número menor que o inicial, ignorado.");
                continue;
            }
            if (outro % inicial != 0) {
                System.out.println("Número não é múltiplo de " + inicial + ". Encerrando.");
                break;
            }
            System.out.println("Número válido e múltiplo de " + inicial + ".");
        }
        scanner.close();
    }
}
