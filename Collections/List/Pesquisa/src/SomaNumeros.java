import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numerosList;

    public SomaNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numerosList.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (Integer num : numerosList) {
            soma += num;
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maior = 0;
        for (Integer num : numerosList) {
            if (num > maior) {
                maior = num;
            }
        }
        return maior;
    }

    public int encontrarMenorNumero() {
        int menor = 0;
        for (Integer num : numerosList) {
            if (num > menor) {
                menor = num;
            }
        }
        return menor;
    }

    public List<Integer> exibirNumeros() {
        return numerosList;
    }
}
