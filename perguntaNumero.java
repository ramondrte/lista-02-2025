import java.util.Scanner;

public class perguntaNumero {
  
    public static void main(String[] args) {
    
    Scanner scanner  = new Scanner(System.in);
  
    double numero;
   
    System.out.println("Bom dia, espero que seu dia seja maravilhoso");
   
    System.out.print("Por favor, insira um número: ") ;

    numero = scanner.nextDouble();
   
    System.out.println("Você inseriu o número: "  + numero);
   
    scanner.close();
    
    }
    
}
