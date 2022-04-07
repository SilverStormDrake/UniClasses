package Lista_Exercicios1;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        String op = scanner.next();
        scanner.close();
        op = op.toUpperCase();
        if(op.equals("M")){
            System.out.println((num1+num2)/2);
        }else if(op.equals("S")){
            if(num1 > num2){
                System.out.println(num1-num2);
            }else
                System.out.println(num2-num1);
        }else if(op.equals("P")){
            System.out.println(num1*num2);
        }else if(op.equals("D")){
            System.out.println(num1/num2);
        }else
            System.out.println("Opcao invalida");
    }
}
