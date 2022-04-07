package Lista_Exercicios1;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float x = scanner.nextFloat();
        float y = scanner.nextFloat();

        if(x > y){
            System.out.println(x);
            System.out.println(y);
        }else{
            System.out.println(y);
            System.out.println(x);
        }
        scanner.close();
    }
}
