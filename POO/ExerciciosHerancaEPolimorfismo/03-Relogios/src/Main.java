public class Main {
    public static void main(String[] args) {
        System.out.println("--- Criando Relógios ---");
        Relogio relogioBR = new RelogioBrasileiro(14, 30, 0);
        System.out.println("Hora no Brasil: " + relogioBR.mostrarHora());

        Relogio relogioEUA = new RelogioAmericano(14, 30, 0);
        System.out.println("Hora nos EUA: " + relogioEUA.mostrarHora());

        System.out.println("\n--- Sincronizando os relógios ---");
        Relogio relogioEUA2 = new RelogioAmericano(0, 0, 0);
        System.out.println("Relógio EUA 2 antes de sincronizar: " + relogioEUA2.mostrarHora());

        relogioEUA2.sincronizar(relogioBR);
        System.out.println("Relógio EUA 2 depois de sincronizar: " + relogioEUA2.mostrarHora());
    }
}