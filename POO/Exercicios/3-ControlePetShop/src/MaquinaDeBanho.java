public class MaquinaDeBanho {
    // CONSTANTES
    private static final int CAPACIDADE_MAXIMA_AGUA = 30;
    private static final int CAPACIDADE_MAXIMA_SHAMPOO = 10;
    private static final int DOSE_ABASTECIMENTO = 2;
    private static final int CONSUMO_AGUA_BANHO = 10;
    private static final int CONSUMO_SHAMPOO_BANHO = 2;
    private static final int CONSUMO_AGUA_LIMPEZA = 3;
    private static final int CONSUMO_SHAMPOO_LIMPEZA = 1;

    // ATRIBUTOS
    private boolean haPet;
    private int agua;
    private int shampoo;
    private boolean maquinaLimpa;
    private boolean petLimpo;

    public MaquinaDeBanho() {
        this.agua = CAPACIDADE_MAXIMA_AGUA;
        this.shampoo = CAPACIDADE_MAXIMA_SHAMPOO;
        this.maquinaLimpa = true;
        this.haPet = false;
        this.petLimpo = false;
    }

    // ABASTECIMENTO MÁQUINA

    public void abastecerAgua() {
        if (this.agua < CAPACIDADE_MAXIMA_AGUA) {
            this.agua = Math.min(CAPACIDADE_MAXIMA_AGUA, this.agua + DOSE_ABASTECIMENTO);
            System.out.println("Água abastecida! Nível atual: " + this.agua + "L de água");
        } else {
            System.out.println("A máquina já está cheia de água.");
        }
    }

    public void abastecerShampoo() {
        if (this.shampoo < CAPACIDADE_MAXIMA_SHAMPOO) {
            this.shampoo = Math.min(CAPACIDADE_MAXIMA_SHAMPOO, this.shampoo + DOSE_ABASTECIMENTO);
            System.out.println("Shampoo abastecido! Nível atual: " + this.shampoo + "L de Shampoo");
        } else {
            System.out.println("A máquina já está cheia de Shampoo.");
        }
    }

    // PET

    public void colocarPet() {
        if (this.haPet) {
            System.out.println("Já tem um pet na máquina.");
        } else {
            this.haPet = true;
            this.petLimpo = false;
            System.out.println("Pet colocado.");
        }
    }

    public void retirarPet() {
        if (this.haPet) {
            this.haPet = false;
            System.out.println("Pet retirado.");
        } else {
            System.out.println("Não há pet na máquina.");
        }
        if (!this.petLimpo) {
            System.out.println("Pet retirado antes de ser limpo. Limpeza na máquina necessária!");
            this.maquinaLimpa = false;
        }
    }

    // MÁQUINA

    public void banhoPet() {
        if (!this.maquinaLimpa) {
            System.out.println("A máquina está suja. Limpe a primeiro");
            return;
        }
        if (this.haPet) {
            if (this.agua >= 10 && this.shampoo >= 2) {
                this.petLimpo = true;
                this.agua -= 10;
                this.shampoo -= 2;
                System.out.println("Banho realizado. O pet está limpo.");
            } else {
                System.out.println("Abasteça a máquina antes.");
            }
        } else {
            System.out.println("Coloque um pet na máquina antes.");
        }
    }

    public void limparMaquina() {
        if (this.maquinaLimpa) {
            System.out.println("A máquina já está limpa e pronta para uso!");
        } else {
            if (this.agua >= 3 && this.shampoo >= 1) {
                this.agua -= 3;
                this.shampoo -= 1;
                this.maquinaLimpa = true;
                System.out.println("Limpeza realizada. A máquina agora está limpa");
            } else {
                System.out.println("Abasteça a máquina antes.");
            }
        }
    }

    // GETTERS

    public int getAgua() {
        return this.agua;
    }

    public int getShampoo() {
        return this.shampoo;
    }

    public boolean isHaPet() {
        return this.haPet;
    }

    public boolean isMaquinaLimpa() {
        return this.maquinaLimpa;
    }

    public boolean isPetLimpo() {
        return this.petLimpo;
    }

}
