import java.util.Scanner;

public class Class_2_Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        
        if(num >= 50 && num <=100){
            System.out.println("O numero esta entre 50 e 100");
        }
        else{
            System.out.println("O numero nao esta entre 50 e 100");
        }

    }
}
