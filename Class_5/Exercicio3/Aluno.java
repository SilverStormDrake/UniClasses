package Exercicio3;

public class Aluno {
    String nome;
    int ra;
    double n1;
    double n2;

    public double media(){
        return (n1+n2)/2;
    }

    public String toString(){
        return "Nome: " + nome + "\nRA: " + ra + "\nNota N1: " + n1 + "\nNota N2: " + n2;
    }
}
