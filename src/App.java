public class App {
    public static void main (String[] args){

        Banco banco = new Banco("Lana", "Livia", "Brenno");

        banco.creditar("Lana", 5000.0);
        banco.debitar ("Livia", 1000.0);
        banco.creditar("Brenno", 3500.0);

        banco.transferir("Livia", "Lana", 500.0);

        System.out.println("Saldo de Lana: R$" +banco.getSaldo("Lana"));
        System.out.println("Saldo de Lívia: R$" +banco.getSaldo("Livia"));
        System.out.println("Saldo de Brenno: R$" +banco.getSaldo("Brenno"));

    }
}
