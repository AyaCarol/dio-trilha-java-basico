import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Insira o nome do cliente: ");
        String nomeCliente = scan.nextLine();

        System.out.print("Insira o número da agência: ");
        String agencia = scan.nextLine();

        System.out.print("Insira o número da conta: ");
        int numero = scan.nextInt();

        System.out.print("Insira o saldo: ");
        double saldo = scan.nextDouble();

        Conta conta = new Conta(numero, agencia, nomeCliente, saldo);

        System.out.println("Olá " + conta.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agencia é " + conta.getAgencia() + ", conta " + conta.getNumero() + " e seu saldo R$" + conta.getSaldo() + " já está disponível para saque");

    }
}
