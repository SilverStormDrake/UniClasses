package Lista_Exercicios1;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        scanner.close();
        System.out.println(num*num);
        System.out.println(num*num*num);
        System.out.println(Math.sqrt(num));
        System.out.println(Math.pow(num, 10));
    }
}
