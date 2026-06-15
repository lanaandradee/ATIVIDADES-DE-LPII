public class Correntista {

    private String nome;
    private ContaCorrente conta;

    public Correntista (String nome){
        this.nome = nome;
        this.conta = new ContaCorrente();

    }
    public String getNome(){
        return this.nome;
    }

    public ContaCorrente getConta(){
        return this.conta;
    }

    public ContaCorrente getContaCorrente() {
    return this.conta;
    }
}
