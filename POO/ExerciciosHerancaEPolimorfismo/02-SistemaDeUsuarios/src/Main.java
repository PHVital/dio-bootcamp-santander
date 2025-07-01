import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // --- Fase 1: Contratação (Criação dos Objetos) ---
        System.out.println("--- Contratando novos funcionários ---");
        Gerente gerente = new Gerente("Ana", "ana.gerente@empresa.com", "senhaForte1");
        Vendedor vendedor = new Vendedor("Carlos", "carlos.vendedor@empresa.com", "senhaForte2", 0);
        Atendente atendente = new Atendente("Beatriz", "bia.atendente@empresa.com", "senhaForte3", 100.0);
        System.out.println("Equipe contratada!\n");

        // --- Fase 2: Polimorfismo em Ação ---
        // Podemos tratar todos como 'Usuario' e colocá-los na mesma lista.
        List<Usuario> equipe = new ArrayList<>();
        equipe.add(gerente);
        equipe.add(vendedor);
        equipe.add(atendente);

        System.out.println("--- Início do dia de trabalho (todos fazem login) ---");
        for (Usuario u : equipe) {
            u.realizarLogin(); // Cada um executa o mesmo método, mas com seus próprios dados.
        }
        System.out.println("\n");

        // --- Fase 3: Executando Ações Específicas ---
        System.out.println("--- Executando tarefas do dia ---");
        for (Usuario u : equipe) {
            System.out.println("\nAnalisando o usuário: " + u.getNome());

            // Verificamos o tipo real do objeto para chamar métodos específicos
            if (u instanceof Gerente) {
                Gerente g = (Gerente) u; // Fazemos o "cast" para tratar como Gerente
                g.gerarRelatorioFinanceiro();
            } else if (u instanceof Vendedor) {
                Vendedor v = (Vendedor) u;
                v.realizarVenda();
                v.realizarVenda();
            } else if (u instanceof Atendente) {
                Atendente a = (Atendente) u;
                a.receberPagamento(50.0);
            }
        }
        System.out.println("\n--- Fim do dia de trabalho ---");
    }
}