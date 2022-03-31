package Class_6.Exemplo_1;

public class ContaCorrente {
    private int saldo,numero=0, idade=0;
    private String nome="indefinido"; 

    public ContaCorrente(String nome, int idade){
        this.nome = nome;
        this.idade = idade;

    }

    // setters e getters
    //idade
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }

    //nome
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    //número
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getNumero() {
        return numero;
    }

    //saldo
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    public int getSaldo() {
        return saldo;
    }

    // outros métodos
    public void deposita(int aumento){
        this.saldo += (aumento*0.1) + (aumento);
        System.out.println("valor depositado com sucesso!");
    }

    public void sacar(int valor){
        if (valor > this.saldo) {
            System.out.println("vc n é tao rico assim parsero!");
        } else {
            this.saldo -= valor;
            System.out.printf("O valor de %d foi sacado com sucesso.\nsua conta atual agora está com um saldo de %d reais\n", valor, this.saldo);
        }
    }

}