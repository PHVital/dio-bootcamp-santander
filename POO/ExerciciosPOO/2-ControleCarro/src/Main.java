public class Main {
    public static void main(String[] args) {
        System.out.println("--- SIMULADOR DE CARRO ---\n");

        // --- Fase 1: Carro desligado ---
        System.out.println("--- Testando com o carro desligado ---");
        Carro meuCarro = new Carro();
        meuCarro.acelerar();
        meuCarro.subirMarcha();
        meuCarro.desligar();
        System.out.println("----------------------------------------\n");

        // --- Fase 2: Ligando e arrancando ---
        System.out.println("--- Ligando e arrancando ---");
        meuCarro.ligar();
        meuCarro.acelerar(); // Deve falhar (ponto morto)
        meuCarro.subirMarcha(); // Engata a 1ª
        meuCarro.acelerar();
        meuCarro.acelerar();
        System.out.println("----------------------------------------\n");

        // --- Fase 3: Trocando marchas e respeitando limites ---
        System.out.println("--- Trocando marchas ---");
        // Acelerando até o limite da 1ª marcha
        for (int i = 0; i < 18; i++) {
            meuCarro.acelerar();
        }
        System.out.println("Velocidade atual: " + meuCarro.getVelocidade() + " km/h");

        System.out.println("\nTentando subir para a 2ª marcha...");
        meuCarro.subirMarcha();

        System.out.println("Tentando acelerar mais...");
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();
        System.out.println("Velocidade atual: " + meuCarro.getVelocidade() + " km/h");

        System.out.println("\n--- Testando a função de virar ---");
        meuCarro.virar("esquerda");

        // Acelerando para uma velocidade que impede virar
        System.out.println("\nAcelerando para mais de 40km/h...");
        for (int i = 0; i < 17; i++) {
            meuCarro.acelerar();
        }
        meuCarro.subirMarcha();
        meuCarro.acelerar();
        System.out.println("Velocidade atual: " + meuCarro.getVelocidade() + " km/h");
        meuCarro.virar("direita"); // Deve falhar
        System.out.println("----------------------------------------\n");

        // --- Fase 4: Desacelerando e parando ---
        System.out.println("--- Desacelerando e parando o carro ---");
        System.out.println("Desacelerando até parar...");
        while (meuCarro.getVelocidade() > 0) {
            meuCarro.desacelerar();
        }

        System.out.println("\nTentando desligar o carro na marcha atual (" + meuCarro.getMarcha() + ")...");
        meuCarro.desligar(); // Deve falhar

        System.out.println("Reduzindo as marchas até o ponto morto...");
        while (meuCarro.getMarcha() > 0) {
            meuCarro.descerMarcha();
        }

        System.out.println("\nTentando desligar o carro agora...");
        meuCarro.desligar();
        System.out.println("O carro está ligado? " + meuCarro.isLigado());
        System.out.println("----------------------------------------\n");
    }
}