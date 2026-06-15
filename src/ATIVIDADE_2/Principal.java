public class Principal{
    public static void main(String[] args){
        SistemaGestao[] funcionarios = new SistemaGestao[2];
        funcionarios[0] = new Horista("Brenno", "111.222.333-44", 40, 50.0);
        funcionarios[1] = new Mensalista("Lana", "555.666.777-88", 4500.0);
        for (int i = 0; i < funcionarios.length; i++) {
            System.out.println("Funcionário: " + funcionarios[i].getNome() + " | Pagamento: R$ " + funcionarios[i].calcularPagamento());
        }
    }
}