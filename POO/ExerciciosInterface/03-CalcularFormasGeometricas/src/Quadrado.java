public class Quadrado extends FiguraGeometrica {
    private double lado;

    public Quadrado(double lado, String nome){
        super(nome);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
