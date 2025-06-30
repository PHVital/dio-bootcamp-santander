public class Main {
    public static void main(String[] args) {
        MeiaEntrada ME = new MeiaEntrada(10, "John Wick", true);
        Familia familiaPequena = new Familia(10, "Saw", false, 2);
        Familia familiaGrande = new Familia(10, "Saw", false, 4);

        System.out.println(ME.getValor());
        System.out.println(familiaPequena.getValor());
        System.out.println(familiaGrande.getValor());
    }
}