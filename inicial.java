import java.util.Scanner;

public class inicial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro:");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro:");
        int numero2 = scanner.nextInt();

        scanner.close();

        System.out.println("A soma dos dois números é: " + (numero1 + numero2));
    
        
    }
}