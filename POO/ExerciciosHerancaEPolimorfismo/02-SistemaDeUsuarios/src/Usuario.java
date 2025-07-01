public abstract class Usuario {
    private String nome;
    private String email;
    private String senha;
    private final boolean isAdmin;

    public Usuario(String nome, String email, String senha, boolean isAdmin) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.isAdmin = isAdmin;
    }

    public void realizarLogin() {
        System.out.println(this.nome + " realizou login com sucesso.");
    }

    public void realizarLogout() {
        System.out.println(this.nome + " realizou logout com sucesso.");
    }

    public void alterarSenha(String novaSenha) {
        this.senha = novaSenha;
        System.out.println("Senha de " + this.nome + " alterada.");
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public boolean isAdmin() {
        return isAdmin;
    }
}
