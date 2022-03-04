import java.util.Scanner;;

public class CalculadoraExemplo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice = scanner.nextLine().charAt(0);
        float a = 0, b = 0, c;
        if(choice == '+' || choice == '-' || choice == '*' || choice == '/'){
            a = scanner.nextFloat();
            b = scanner.nextFloat();
        }
        scanner.close();

        switch (choice) {
            case '+':
                c = a+b;
                System.out.println(c);
                break;
            case '-':
                c = a-b;
                System.out.println(c);
                break;
            case '*':
                c = a*b;
                System.out.println(c);
                break;
            case '/':
                if(b == 0){
                    break;
                }else{
                    c = a/b;
                    System.out.println(c);
                }
                break;
            default:
                System.out.println("Operacao Invalida");
                break;
        }
    }
}
