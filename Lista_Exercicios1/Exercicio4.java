package Lista_Exercicios1;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x,y;
        x = scanner.nextInt();
        y = scanner.nextInt();
        System.out.printf("%d", x*y);
        scanner.close();
    }
}
