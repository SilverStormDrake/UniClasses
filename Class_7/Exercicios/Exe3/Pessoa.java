package Class_7.Exercicios.Exe3;

public class Pessoa {
    public String dizerInformacoes(String nome){
        return "Meu nome é " + nome;
    }

    public String dizerInformacoes(int idade){
        return "Minha idade é " + idade;
    }

    public String dizerInformacoes(double peso, double altura){
        return "Meu peso é " + peso + "\nMinha altura é " + altura;
    }
}
