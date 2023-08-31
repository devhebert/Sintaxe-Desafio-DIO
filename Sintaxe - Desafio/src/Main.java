import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da agência:");
        String agencia = sc.nextLine();

        System.out.println("Por favor, digite conta:");
        Integer conta = sc.nextInt();

        System.out.println("Por favor, digite seu nome:");
        String nome = sc.next();

        System.out.println("Por favor, digite o valor a depositar:");
        BigDecimal saldo = sc.nextBigDecimal();

        ContaTerminal novaConta = new ContaTerminal(agencia, conta, nome, saldo);

        System.out.println("Olá " + novaConta.getNome() + ", obrigado por criar uma conta em nosso banco," +
                " sua agência é "+ novaConta.getAgencia() + ", conta "+ novaConta.getNumero() +" e seu saldo " + novaConta.getSaldo()+ " já está disponível para saque.");

        sc.close();
    }
}