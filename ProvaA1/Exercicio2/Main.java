import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int evenCount = 0, oddCount = 0, number;

        for(int i = 0; i<20; i++){
            number = scanner.nextInt();
            if(number < 100){
                if (number%2 == 0){
                    evenCount ++;
                }else
                    oddCount ++;
            }else{
                i --;
                System.out.println("Entrada inválida");
            }
        }
        System.out.println("Pares: " + evenCount +"\nImpares: " + oddCount);
    }
}
