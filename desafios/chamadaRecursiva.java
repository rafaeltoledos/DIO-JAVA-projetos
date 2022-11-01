import java.util.Scanner;

public class chamadaRecursiva {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um valor: ");
          int numero = leitor.nextInt();
          int resultado = somatorio(numero);
          System.out.println(resultado);
  
      }
  
      /**
       * Método útil que calcula o somatório de um número usando recursividade.
       */
      static int somatorio(int numero) {
          if (numero == 0) {
              return 0;
          } else {
              return numero + somatorio(numero - 1);
          }
      }
  }
