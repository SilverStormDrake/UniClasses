package Exemplo;

public class Main {
    public static void main(String[] args) {
        Pessoa andrePessoa = new Pessoa();
        andrePessoa.altura = 1.7;
        andrePessoa.idade = 21;
        andrePessoa.nome = "Andre";

        System.out.println(andrePessoa.toString()); 
    }
}
