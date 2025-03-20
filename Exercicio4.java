import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o preço do litro da gasolina:");
        double precoLitro = scanner.nextDouble();
        System.out.println("Digite a quantidade de litros vendidos:");
        double litrosVendidos = scanner.nextDouble();
        double totalGasolina = precoLitro * litrosVendidos;
        System.out.println("O total a ser pago pela gasolina é: R$" + totalGasolina);
        scanner.close();
    }
}
