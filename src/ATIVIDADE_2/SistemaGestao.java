public abstract class SistemaGestao {
    protected String nome;
    protected String cpf;

    public SistemaGestao(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public abstract double calcularPagamento();
    public String getNome() {
        return this.nome;
    }
}
