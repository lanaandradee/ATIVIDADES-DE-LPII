public class Mensalista extends SistemaGestao{
    private double salarioFixo;

    public Mensalista(String nome, String cpf, double salarioFixo){
        super(nome, cpf);
        this.salarioFixo = salarioFixo;
    }
    @Override
    public double calcularPagamento(){
        return this.salarioFixo;
    }
}