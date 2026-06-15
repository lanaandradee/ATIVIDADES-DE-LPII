public class Horista extends SistemaGestao{
    private int horasTrabalhadas;
    private double valorHora;

    public Horista(String nome, String cpf, int horasTrabalhadas, double valorHora){
        super(nome, cpf);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }
    @Override
    public double calcularPagamento() {
        return this.horasTrabalhadas * this.valorHora;
    }
}