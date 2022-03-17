import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salario = scanner.nextDouble();
        double prestacao = scanner.nextDouble();
        scanner.close();
        if(salario*0.3 < prestacao){
            System.out.println("Emprestimo nao pode ser concedido");
        }else{
            System.out.println("Emprestimo pode ser concedido");
        }
    }
}
