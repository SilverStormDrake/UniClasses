package Class_7.Exercicios.Exe4;

public class Main {
    public static void main(String[] args) {
        Funcionario func = new Funcionario();
        Gerente gerente = new Gerente();

        func.nome = "Roberto Souza";
        func.cargo = "Estagiário";
        func.salario = 1070;
        System.out.println(func.toString());
        gerente.atualizar(func, "Auxiliar");
        gerente.atualizar(func, 1200);
        System.out.println(func.toString());
    }
}
