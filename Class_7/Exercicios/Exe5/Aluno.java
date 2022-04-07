package Class_7.Exercicios.Exe5;

public class Aluno {
    private String _nome;
    private int _RA;

    public Aluno(){}
    
    public Aluno(int RA){
        this._RA = RA;
    }
    
    public Aluno(String nome, int RA){
        this._nome = nome;
        this._RA = RA;
    }

    public String toString(){
        return "Nome: " + _nome + "\n RA: " + _RA;
    }

}
