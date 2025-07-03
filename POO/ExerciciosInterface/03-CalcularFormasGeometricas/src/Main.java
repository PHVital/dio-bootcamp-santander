import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FiguraGeometrica quadrado = new Quadrado(5, "Quadrado");
        FiguraGeometrica retangulo = new Retangulo(8, 10, "Retangulo");
        FiguraGeometrica circulo = new Circulo(10, "Circulo");

        List<FiguraGeometrica> figuras = new ArrayList<FiguraGeometrica>();
        figuras.add(quadrado);
        figuras.add(retangulo);
        figuras.add(circulo);

        CalcularArea calculadora = new CalcularArea();
        calculadora.exibirAreasIndividuais(figuras);

        double total = calculadora.calcularAreaTotal(figuras);
        System.out.printf("A soma de todas as áreas é: %.2f%n", total);
    }
}