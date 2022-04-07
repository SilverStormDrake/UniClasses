package Class_3;

import java.util.Scanner;


public class CalculadoraExemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        float a = 0, b = 0;
        if(choice <= 4){
            a = scanner.nextFloat();
            b = scanner.nextFloat();
        }
        float c;
        switch (choice) {
            case 1:
                c = a+b;
                System.out.println(c);
                break;
            case 2:
                c = a-b;
                System.out.println(c);
                break;
            case 3:
                c = a*b;
                System.out.println(c);
                break;
            case 4:
                c = a/b;
                System.out.println(c);
                break;
            default:
                System.out.println("Operacao Invalida");
                break;
        }
        scanner.close();
    }    
}
