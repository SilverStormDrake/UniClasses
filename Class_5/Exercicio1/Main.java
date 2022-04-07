package Class_5.Exercicio1;


public class Main {
    public static void main(String[] args) {
        Lampada lampada1 = new Lampada();

        lampada1.marca = "Luxmax";
        lampada1.preco = 10.0;

        System.out.println(lampada1.subtotal(5));
    }
}

