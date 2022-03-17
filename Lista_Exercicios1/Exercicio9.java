import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int anoNasc = scanner.nextInt();
        int anoAtual = scanner.nextInt();
        System.out.printf("%d\n", anoAtual-anoNasc);
        System.out.printf("%d\n", 2030-anoNasc);
        scanner.close();
    }
}
