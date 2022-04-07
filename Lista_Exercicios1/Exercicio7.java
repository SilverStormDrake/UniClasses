package Lista_Exercicios1;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();
        scanner.close();
        choice = choice.toUpperCase();
        if(choice.equals("M")){
            System.out.println("bom dia");
        }else if(choice.equals("V")){
            System.out.println("boa tarde");
        }else if(choice.equals("N")){
            System.out.println("boa noite");
        }else{
            System.out.println("Entrada invalida");
        }
    }
}
