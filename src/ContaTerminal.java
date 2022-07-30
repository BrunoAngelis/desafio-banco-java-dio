import java.util.Scanner;

public class ContaTerminal {

    String nomeCliente;
    String agencia;
    int numero;
    double saldo = 0.00;

    Scanner scanner = new Scanner(System.in);

    public void CadastrarCliente(){

        System.out.printf("Digite o nome para cadastro: ");
        nomeCliente = scanner.nextLine();
        System.out.printf("Digite a agência: ");
        agencia = scanner.next();
        System.out.printf("Digite o numero da conta : ");
        numero = scanner.nextInt();
        System.out.println("Digite o valor do primeio deposito em conta: ");
        saldo = scanner.nextDouble();
    }

    public void ExibirDados(){
        System.out.println("Olá " +nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque.");
    }

}
