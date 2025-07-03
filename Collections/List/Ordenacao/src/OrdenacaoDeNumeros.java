import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoDeNumeros {
    private List<Integer> numerosList;

    public OrdenacaoDeNumeros() {
        numerosList = new ArrayList<Integer>();
    }

    public void adicionarNumero(int num) {
        numerosList.add(num);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosListOrdenada = numerosList;
        Collections.sort(numerosListOrdenada);
        return numerosListOrdenada;
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosListOrdenada = numerosList;
        Collections.sort(numerosListOrdenada, Collections.reverseOrder());
        return numerosListOrdenada;
    }

}
