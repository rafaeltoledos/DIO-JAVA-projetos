import java.util.Scanner;

public class parEImpar {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int quantNumeros;
            int numero;
            int quantPar = 0, quantImpar = 0;

            System.out.println("Quantidade de números: ");
            quantNumeros = scan.nextInt();

            int count = 0;
            do{
                System.out.println("Número: ");
                numero = scan.nextInt();

                if(numero % 2 == 0) quantPar++; //quantPar = quantPar + 1
                else quantImpar++;

                count++;
            } while(count < quantNumeros);
            System.out.println("Quantidade par: " + quantPar);
            System.out.println("Quantidade ímpar: " + quantImpar);
    }
}
