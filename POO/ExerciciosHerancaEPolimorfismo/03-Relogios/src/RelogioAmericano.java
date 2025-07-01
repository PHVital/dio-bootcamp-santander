public class RelogioAmericano extends Relogio {
    public RelogioAmericano(int hora, int minuto, int segundo) {
        super(0, minuto, segundo);
        this.setHora(hora);
    }

    @Override
    public void setHora(int hora) {
        if (hora >= 0 && hora <= 23) {
            if (hora == 0) {
                this.hora = 12;
            } else if (hora > 12) {
                this.hora = hora - 12;
            } else {
                this.hora = hora;
            }
        } else {
            System.out.println("Valor de hora inválido: " + hora);
        }
    }

    @Override
    public String mostrarHora() {
        return String.format("%02d:%02d:%02d", this.hora, this.minuto, this.segundo) + " (Formato AM/PM)";
    }

    @Override
    public void sincronizar(Relogio outroRelogio) {
        System.out.println("Sincronizando relógio americano com base no relógio fornecido...");
        this.setHora(outroRelogio.getHora());
        this.setMinuto(outroRelogio.getMinuto());
        this.setSegundo(outroRelogio.getSegundo());
    }
}
