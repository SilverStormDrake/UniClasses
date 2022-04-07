package Class_7.Exercicios.Exe4;

public class Gerente {
    public String nome;

    public void atualizar(Funcionario aux, String cargo){
        aux.cargo = cargo;
    }

    public void atualizar(Funcionario aux, double salario){
        aux.salario = salario;
    }
}
