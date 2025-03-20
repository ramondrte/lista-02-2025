import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o preço da viagem para a Alemanha:");
        double precoAlemanha = scanner.nextDouble();
        System.out.println("Digite o preço da viagem para Portugal:");
        double precoPortugal = scanner.nextDouble();
        System.out.println("Digite o preço da viagem para a Itália:");
        double precoItalia = scanner.nextDouble();
        System.out.println("Digite a quantidade de pessoas que irão viajar:");
        int quantidadePessoas = scanner.nextInt();
        double totalViagem = (precoAlemanha + precoPortugal + precoItalia) * quantidadePessoas;
        System.out.println("O total da viagem para todas as pessoas é: R$" + totalViagem);
        scanner.close();
    }
}
