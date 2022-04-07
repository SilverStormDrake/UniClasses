package Class_7.Exercicios.Exe2;
public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println(calc.operacao(2.5, 3.5));
        System.out.println(calc.operacao(5, 2.5));
        System.out.println(calc.operacao(4.5, 2));
        System.out.println(calc.operacao(4, (short)3));
    }
}
