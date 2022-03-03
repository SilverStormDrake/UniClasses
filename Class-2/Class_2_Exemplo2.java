import java.util.Scanner;

public class Class_2_Exemplo2{
    public static void main(String[] args){
        int age;
        Scanner scanner = new Scanner(System.in);

        age = scanner.nextInt();
        scanner.close();

        if(age >= 18){
            System.out.println("Eh maior de idade\n");
        }else{
            System.out.println("Eh menor de idade\n");
        }
    }
}