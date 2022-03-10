import java.util.Scanner;

public class Class_4{
    public static void main(String[] args) {
        /*
        * int x = 5, y = 0;
        * y =x++ + ++x; //Operadores pré-fixados e pós fixados
        * System.out.println(y);
        */

        /* Números de 0 a 50
        * for(int i =0; i<=50; i++){
        *    System.out.println(i);
        */
        
        Scanner scanner = new Scanner(System.in);
        int idade, sum = 0;
        for(int i = 0; i<5; i++){
            idade = scanner.nextInt();
            sum += idade;
        }
        System.out.println(sum);;
        scanner.close();
    }
}