import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salario = scanner.nextDouble();
        scanner.close();

        if(salario <= 600){
            System.out.println("Isento");
        }else if(salario > 600 && salario <= 1200){
            System.out.println(salario*0.2);
        }else if(salario > 1200 && salario <= 2000){
            System.out.println(salario*0.25);
        }else
            System.out.println(salario*0.3);
    }
}
