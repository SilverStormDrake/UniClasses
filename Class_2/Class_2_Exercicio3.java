package Class_2;

import java.util.Scanner;

public class Class_2_Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num1 = scanner.nextFloat();
        float num2 = scanner.nextFloat();
        scanner.close();
        if(num1 >= num2){
            System.out.printf("%.1f\n%.1f", num1, num2);
        }else{
            System.out.printf("%.1f\n%.1f", num2, num1);
        }
    }
}
