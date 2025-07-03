public abstract class FiguraGeometrica implements Calculavel {
    private String nome;

    public FiguraGeometrica(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
}
