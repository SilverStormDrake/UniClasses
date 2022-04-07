package Class_6.Exemplo_1;

public class Main {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("Ragnaldo Pereira", 77);
        ContaCorrente conta2 = new ContaCorrente("Ximborelsson da Silva", 33);
        
        conta1.setSaldo(6550);
        conta2.setSaldo(350);

        conta1.sacar(400);
        conta2.deposita(400);

        conta1.sacar(7000);

        conta2.deposita(6150);

        System.out.println(conta2.getSaldo());

        System.out.println(conta1.getSaldo());
    }
}
