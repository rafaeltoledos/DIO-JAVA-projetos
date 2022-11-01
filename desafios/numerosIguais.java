import java.util.Scanner;

public class numerosIguais {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        //TODO: Imprima se os valores numéricos passados são iguais ou não.

        System.out.println("Digite o primeiro valor: ");
        int a = leitor.nextInt();
        System.out.println("Digite o segundo valor: ");
        int b = leitor.nextInt();
        
        if(a == b){
          System.out.println("Sao iguais!");
        } else {
            System.out.println("Nao sao iguais!");
        }
        }
    }
