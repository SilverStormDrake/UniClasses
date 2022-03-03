import java.util.Scanner;

public class Class_2_Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;

        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        scanner.close();

        if(num1 > num2){
            System.out.println(num1+"\n");
        }else if(num1 < num2){
            System.out.println(num2+"\n");
        }else{
            System.out.println("Os numeros sao iguais\n");
        }
    }
}
