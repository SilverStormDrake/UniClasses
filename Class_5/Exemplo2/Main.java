package Exemplo2;

public class Main {
    public static void main(String[] args) {
        Nnumeros ordem = new Nnumeros();
        ordem.print(10); 
    }
}

class Nnumeros{
    public void print(int n){
        for(int i = 1; i<=n; i++){
            System.out.printf("%d ", i);
        }
        System.out.println("\n");;
    }
}
