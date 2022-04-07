package Lista_Exercicios1;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean close = false;
        int cod;
        double total = 0;
        int qtd;
    
        while(close == false){
            cod = scanner.nextInt();

            if(cod == 99){
                close = true;
            }else if(cod == 100){
                System.out.println("Cachorro Quente");
                qtd = scanner.nextInt();
                total += 1.20 * qtd;
            }else if(cod == 101){
                System.out.println("Bauru Simple");
                qtd = scanner.nextInt();
                total += 1.30 * qtd;
            }else if(cod == 102){
                System.out.println("Bauru com ovo");
                qtd = scanner.nextInt();
                total += 1.50 * qtd;
            }else if(cod == 103){
                System.out.println("Hambúrguer");
                qtd = scanner.nextInt();
                total += 1.20 * qtd;
            }else if(cod == 104){
                System.out.println("Hambúrguer");
                qtd = scanner.nextInt();
                total += 1.30 * qtd;
            }else if(cod == 105){
                System.out.println("Refrigerante");
                qtd = scanner.nextInt();
                total += 1 * qtd;
            }else
                System.out.println("Codigo invalido");
        }
        scanner.close();
        System.out.println("Total = R$ " + total);      
    }
}