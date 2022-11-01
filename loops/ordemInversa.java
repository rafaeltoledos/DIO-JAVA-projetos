public class ordemInversa {
    
    public static void main(String[] args) {
        
        int[] vetor = { -65, 10, 97, 253, 66, 87};

        //System.out.println(vetor.length);

        System.out.println("Vetor: ");
        int count = 0;
        while(count < (vetor.length)){
            System.out.print(vetor[count] + ", ");
            count++;
        }
        System.out.println("\n Vetor inverso: ");
        for(int i = (vetor.length-1); i >= 0; i--){
            System.out.print(vetor[i] + ", ");
        }

    }
}
