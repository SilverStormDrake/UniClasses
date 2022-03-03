import java.util.Scanner;

public class Class_2_Exe2{
    public static void main(String[] args){
        int age;
        Scanner scanner = new Scanner(System.in);

        age = scanner.nextInt();

        if(age >= 18){
            System.out.println("Eh maior de idade\n");
        }else{
            System.out.println("Eh menor de idade\n");
        }
        
    }
}
