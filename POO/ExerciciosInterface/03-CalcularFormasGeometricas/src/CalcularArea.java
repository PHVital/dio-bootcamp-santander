import java.util.List;

public class CalcularArea {
    public void exibirAreasIndividuais (List<FiguraGeometrica> figuras) {
        System.out.println("--- ÁREAS INDIVIDUAIS ---");
        for (FiguraGeometrica figura : figuras) {
            System.out.printf("A área da figura %s é: %.2f%n", figura.getNome(), figura.calcularArea());
        }
        System.out.println("--------------------------");
    }

    public double calcularAreaTotal(List<FiguraGeometrica> figuras) {
        double areaTotal = 0;
        for (FiguraGeometrica figura : figuras) {
            areaTotal += figura.calcularArea();
        }
        return areaTotal;
    }
}
