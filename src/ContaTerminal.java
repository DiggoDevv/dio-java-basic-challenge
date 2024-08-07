import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        double saldoCliente = 0.00;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Bem-vindo ao nosso banco digital!! ");

        System.out.println("Por favor, digite a sua agência para acessar sua conta");
        String agencia = scanner.next();

        System.out.println("Digite o número da sua agência");
        int numAgencia = scanner.nextInt();

        System.out.println("Digite seu nome");
        String nomeCliente = scanner.next();

        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é" + agencia + ", conta " + numAgencia + " e seu saldo de " + saldoCliente + " já está disponível para saque");
    }
}
