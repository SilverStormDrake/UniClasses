package Class_5.Exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno Aluno1 = new Aluno();
        Aluno1.nome = scanner.nextLine();
        Aluno1.ra = scanner.nextInt();
        Aluno1.n1 = scanner.nextDouble();
        Aluno1.n2 = scanner.nextDouble();
        scanner.close();
        
        System.out.println(Aluno1.toString());
        System.out.println(Aluno1.media());
    }
}
