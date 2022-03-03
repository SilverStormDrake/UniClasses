import java.util.Scanner;

public class Class_2{
    public static void main(String[] args){
        
        //Desvio Simples
        int points = 1000;

        if(points >= 1000){
            System.out.println("Voce passou para a fase 2");
        }
        
        Scanner scanner = new Scanner(System.in);
        int num;

        num = scanner.nextInt();

        if(num > 20){
            System.out.println(num/2);
        }
        

        //Desvio Composto
        if(num % 2 == 0){
            System.out.println("O numero eh par");
        }else{
            System.out.println("O numero eh impar");
        }

        scanner.close();
    }
}
