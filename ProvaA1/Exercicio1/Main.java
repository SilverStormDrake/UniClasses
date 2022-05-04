import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        int[] train = new int[6];
        int sum = 0;
    
        for(int i = 0; i<6; i++){
            train[i] = scanner.nextInt();
            if(train[i] < 0 || train[i]>250){
                i--;
                System.out.println("Entrada invalida");
            }else{
                sum += train[i];
            }
        }
        scanner.close();

        System.out.println("Total de passageiros da composição: " + sum);
        for(int i = 0; i<6; i++){
            System.out.print("Carro "+ (i+1) +" Num. Ocupantes - " + train[i] + ": ");
            if(train[i] <= 50){
                System.out.println("Azul (vazio ou ocupação baixa)");
            } else if(train[i] > 50 && train[i] <= 100){
                System.out.println("Amarela (ocupação média)");
            } else if(train[i] > 100 && train[i] <= 150){
                System.out.println("Laranja (ocupação alta)");
            } else if(train[i] > 150 && train[i] <=250){
                System.out.println("Vermelha (ocupação altíssima ou lotado)");
            }
        }
    }
}
