import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite o número para fatorar: ");
            int fatorial = scan.nextInt();
            int multiplicacao = 1;

            System.out.print(fatorial + "! = ");

            for (int i = fatorial ; i >= 1 ; i-- ){
               multiplicacao = multiplicacao * i;
                
            }
            System.out.println(multiplicacao);
        }
    }
}
