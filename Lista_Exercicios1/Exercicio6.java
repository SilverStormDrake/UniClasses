import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.close();
        
        if(x >= 50 && x <= 100){
            System.out.println("Pertence ao intervalo");
        }else{
            System.out.println("Não pertence ao intervalo");
        }
    }
}
