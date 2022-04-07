package Class_7.Exercicios.Exe3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();
        int idade = scanner.nextInt();
        double peso = scanner.nextDouble();
        double altura = scanner.nextDouble();
        scanner.close();

        Pessoa p1 = new Pessoa();

        System.out.println(p1.dizerInformacoes(nome));
        System.out.println(p1.dizerInformacoes(idade));
        System.out.println(p1.dizerInformacoes(peso, altura));
        
    }
}
