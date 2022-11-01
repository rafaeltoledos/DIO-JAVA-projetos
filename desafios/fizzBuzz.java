import java.util.Scanner;

public class fizzBuzz {
    public static void main(String[] args) {
            Scanner number = new Scanner(System.in);
            
            System.out.println("Digite um valor: ");
            int num = number.nextInt();
        
            System.out.println(fizzBuzz(num));}
        
    
        public static String fizzBuzz(int numero){
            if((numero%3 == 0) && (numero%5 ==0))
                return "FizzBuzz";
            if(numero%3 == 0)
                return "Fizz";
            if(numero%5 == 0)
                return "Buzz";
            return "" + numero;
        }
    }