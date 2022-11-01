import java.util.Scanner;

public class maiorEMedia {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int numero;
            int count = 0;
            int maior = 0;
            int soma = 0;

            do{
                System.out.println("Número: ");
                numero = scan.nextInt();

                soma = soma + numero;

                if(numero > maior) maior = numero;

                count = count + 1;
            } while(count < 5);

            System.out.println("Maior: " + maior);

            System.out.println("Média: " + (soma/5));
        }

    }
    
}
