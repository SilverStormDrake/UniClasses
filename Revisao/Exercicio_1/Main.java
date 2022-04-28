package Exercicio_1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double [] notas = new double[5];
        double media = 0d, sum = 0d;
        
        for(int i = 0; i<5; i++){
            notas[i] = scanner.nextDouble();
            sum += notas[i];
        }
        scanner.close();
        
        media = sum/5;
        System.out.println(media);
        for(int i = 0; i<5; i++){
            if(notas[i] >= media){
                System.out.println("Parabéns");
            }else
                System.out.println("Estude Mais");
        }

    }
}
