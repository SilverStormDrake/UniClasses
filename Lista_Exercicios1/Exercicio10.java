package Lista_Exercicios1;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senha = "R10p5";
        String input = scanner.next();
        if(input.equals(senha)){
            System.out.println("acesso concedido");
        }else
            System.out.println("acesso negado");
        scanner.close();
    }
}