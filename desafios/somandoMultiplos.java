// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.  

import java.util.Scanner;

public class somandoMultiplos {
    
    public static void main(String[] args) {
        int A, N;

        Scanner input = new Scanner(System.in);

        System.out.println("Primeiro valor: ");
        A = input.nextInt();
        System.out.println("Segundo valor: ");
        N = input.nextInt();

        int soma = 0;

        for(int i = 0; i <= N; i++){
            if(i%A == 0){
                soma+=i;
            }
        }
        
        System.out.println(soma);
        //TODO:  Retorne o valor da soma de todos múltiplos de "A" até o seu limite "N".
    }
}