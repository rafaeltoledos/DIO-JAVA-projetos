import java.util.Scanner;

public class tabuada {
    
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Tabuada do número: ");
            int tabuada = scan.nextInt();

            System.out.println("Tabuada de " + tabuada);

            for(int i = 1; i <= 10; i++) { //contador; condição limite; intervalo
                System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
            }
        }

    }
}
