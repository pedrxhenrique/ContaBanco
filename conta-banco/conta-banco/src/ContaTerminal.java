import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
//int numero;
        //String agencia;
        //String nomeCliente;
        //double saldo;

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite o numero da agencia ");
        String agencia = sc.nextLine();

        System.out.println("Digite seu nome ");
        String nomeCliente = sc.nextLine();

        System.out.println("Digite o numero da sua conta ");
        int numeroConta = sc.nextInt();

        System.out.println("Digite o numero do seu deposito ");
        double saldo = sc.nextDouble();

        System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia eh " + agencia + ", conta " + numeroConta + ", e seu saldo pra saque eh de " + saldo);

        sc.close();
    }
}
