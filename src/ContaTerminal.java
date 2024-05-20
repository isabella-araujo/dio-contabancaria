import java.util.Scanner;

public class ContaTerminal {
    static Scanner scanner = new Scanner(System.in);
    protected static String nomeCliente;
    protected static int numero;
    protected static String agencia;
    protected static double saldo;

    public static void coletarDados() {
        System.out.println("+----------+ Bem-vindo +----------+");
        System.out.print("Por favor, digite seu nome: ");
        nomeCliente = scanner.nextLine();
        System.out.println("Olá, " + nomeCliente + ". Por favor, digite os dados para a criação de sua conta.");

        System.out.print("Agência: ");
        agencia = scanner.nextLine();

        System.out.print("Número: ");
        numero = scanner.nextInt();

        System.out.print("Saldo: ");
        saldo = scanner.nextDouble();
    }

    public static void imprimirDados() {
        System.out.println("+------------------------------------------+");
        System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco!");
        System.out.println("Seus dados são: ");
        System.out.println("+ Agencia: " + agencia);
        System.out.println("+ Número: " + numero);
        System.out.println("+ Saldo: R$" + saldo);
    }

    public static void main(String[] args) {
        coletarDados();
        imprimirDados();
    }
}