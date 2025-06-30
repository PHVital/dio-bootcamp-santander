public class Carro {
    private boolean ligado;
    private int velocidade;
    private int marcha;

    public Carro() {
        this.ligado = false;
        this.velocidade = 0;
        this.marcha = 0;
    }

    // MÉTODOS DE ESTADO DO CARRO

    public void ligar() {
        if (this.ligado) {
            System.out.println("O carro já está ligado!");
        } else {
            this.ligado = true;
            System.out.println("Carro ligado!");
        }
    }

    public void desligar() {
        if (this.velocidade == 0 && this.marcha == 0 && this.ligado) {
            this.ligado = false;
            System.out.println("Carro desligado!");
        } else if (!this.ligado) {
            System.out.println("O carro já está desligado!");
        } else {
            System.out.println("Não é possível desligar. O carro precisa estar parado e em ponto morto.");
        }
    }

    // MÉTODOS DE MOVIMENTO

    public void acelerar() {
        if (!this.ligado) {
            System.out.println("Não foi possível acelerar o carro. Ligue o carro primeiro");
            return;
        }
        if (this.marcha == 0) {
            System.out.println("Não é possível acelerar em ponto morto. Engate uma marcha");
            return;
        }
        boolean podeAcelerar = switch (this.marcha) {
            case 1 -> this.velocidade < 20;
            case 2 -> this.velocidade < 40;
            case 3 -> this.velocidade < 60;
            case 4 -> this.velocidade < 80;
            case 5 -> this.velocidade < 100;
            case 6 -> this.velocidade < 120;
            default -> false;
        };

        if (podeAcelerar) {
            this.velocidade++;
            System.out.println("Velocidade " + this.velocidade + " km/h");
        } else {
            System.out.println("Limite de velocidade para a marcha atingida. Troque de marcha para poder acelerar");
        }
    }

    public void desacelerar() {
        if (!this.ligado) {
            System.out.println("Não foi possível desacelerar o carro. Ligue o carro primeiro");
            return;
        }
        if (this.velocidade > 0) {
            this.velocidade--;
            System.out.println("Velocidade " + this.velocidade + " km/h");
        } else {
            System.out.println("O carro já está parado.");
        }
    }

    public void virar(String direcao) {
        if (!this.ligado) {
            System.out.println("Não foi possível virar o carro. Ligue o carro primeiro");
            return;
        }
        if (this.velocidade >= 1 && this.velocidade <= 40) {
            System.out.println("Você virou para a " + direcao);
        } else {
            System.out.println("Não foi possíve virar. Reduza a velocidade para menos de 40 km/h");
        }
    }

    // MÉTODOS DE MARCHA

    public void subirMarcha() {
        if (!this.ligado) {
            System.out.println("Ligue o carro para trocar de marcha.");
            return;
        }

        int proximaMarcha = this.marcha + 1;
        boolean podeSubir = switch (proximaMarcha) {
            case 1 -> this.velocidade >= 0;
            case 2 -> this.velocidade >= 20;
            case 3 -> this.velocidade >= 40;
            case 4 -> this.velocidade >= 60;
            case 5 -> this.velocidade >= 80;
            case 6 -> this.velocidade >= 100;
            default -> false;
        };

        if (podeSubir) {
            this.marcha++;
            System.out.println("Marcha: " + this.marcha + "ª");
        } else {
            System.out.println("Velocidade incompatível para subir de marcha.");
        }
    }

    public void descerMarcha() {
        if (!this.ligado) {
            System.out.println("Ligue o carro para trocar de marcha.");
            return;
        }

        if (this.marcha > 0) {
            boolean podeDescer = switch(this.marcha - 1) {
                case 0 -> true;
                case 1 -> this.velocidade <= 20;
                case 2 -> this.velocidade <= 40;
                case 3 -> this.velocidade <= 60;
                case 4 -> this.velocidade <= 80;
                case 5 -> this.velocidade <= 100;
                default -> false;
            };

            if (podeDescer) {
                this.marcha--;
                System.out.println("Marcha: " + (this.marcha == 0 ? "Ponto morto" : this.marcha + "ª"));
            } else {
                 System.out.println("Velocidade muito alta para descer de marcha.");
            }
        } else {
            System.out.println("O carro já está em ponto morto.");
        }
    }

    // GETTERS

    public int getVelocidade() {
        return this.velocidade;
    }

    public int getMarcha() {
        return this.marcha;
    }

    public boolean isLigado() {
        return this.ligado;
    }
}
