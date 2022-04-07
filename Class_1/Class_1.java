package Class_1;

import java.util.Scanner;
public class Class_1{
    public static void main(String[] args){
        int age1 = 21;
        String name1 = "Andre Luiz";
        System.out.println(name1 + " have " + age1 + " years old\n");

        int age2;
        String name2;
        Scanner scanner = new Scanner(System.in);
        name2 = scanner.nextLine();
        age2 = scanner.nextInt();
        System.out.println(name2 + " have " + age2 + " years old\n");
        scanner.close();
    }
}