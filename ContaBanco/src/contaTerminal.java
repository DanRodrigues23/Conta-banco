import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {
        
       int accountNumber;
       String agency;
       String client;
       double money;

       Scanner scanner = new Scanner (System.in);

       System.out.println("Digite o número da conta: ");
       accountNumber = scanner.nextInt();

       scanner.nextLine();

       System.out.println("Digite sua agência: ");
       agency = scanner.nextLine();

       System.out.println("Digite seu nome: ");
       client = scanner.nextLine();

       System.out.println("Digite o saldo inicial: ");
       money = scanner.nextDouble();   
       
       scanner.close();

       System.out.println("Olá " + client + ", obrigado por criar uma conta em nosso banco");
       System.out.println("Seu número da conta é: " + accountNumber);
       System.out.println("Sua agência é: " + agency);
       System.out.println("Seu saldo inicial para saque é: " + money);
    }
    
}
