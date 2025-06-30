public class Main {
    public static void main(String[] args) {
        System.out.println("--- Criando a Máquina de Banho ---");
        MaquinaDeBanho maquina = new MaquinaDeBanho();
        // Garantir que esteja cheia
        maquina.abastecerAgua();
        maquina.abastecerShampoo();
        System.out.println("\n");

        // Teste 1: Tudo certo
        System.out.println("--- INICIANDO BANHO 1 ---");
        maquina.colocarPet();
        maquina.banhoPet();
        maquina.retirarPet();
        System.out.println("-------------------------\n");

        // Teste 2: Testando Regras de Falhas
        System.out.println("--- INICIANDO BANHO 2 ---");
        maquina.colocarPet();
        maquina.retirarPet();
        maquina.banhoPet();
        maquina.colocarPet();
        System.out.println("-------------------------\n");

        // Teste 3: Limpando a Máquina e Tentando de Novo
        System.out.println("--- LIMPANDO A MÁQUINA ---");
        maquina.retirarPet();
        maquina.limparMaquina();
        System.out.println("-------------------------\n");

        System.out.println("--- TENTANDO BANHO 2 NOVAMENTE ---");
        maquina.colocarPet();
        maquina.banhoPet();
        maquina.retirarPet();
        System.out.println("-------------------------\n");

        // Teste 4: Testando Falta de Recursos
        System.out.println("--- INICIANDO BANHO 3 (FALHA POR FALTA DE RECURSOS ---");
        maquina.colocarPet();
        maquina.banhoPet();

        System.out.println("\n--- TENTANDO ABASTECER ---");
        maquina.abastecerAgua();
        maquina.abastecerShampoo();
        System.out.println("-------------------------\n");
    }
}