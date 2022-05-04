import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Há duas principais estruturas de repetição, for e while

        /*
          for é utilizado da seguinte forma:
          primeiro é declarada uma variável que irá conduzir a repetição
          logo em seguida a condição para que a repetição pare
          e o incremento da variavel de controle 
        
        for(int i=0; i<5; i++){
            Logo em seguida há o bloco que irá se repetir até que a condição final seja verdadeira
        }

          Esse tipo de estrutura é util em casos com um número prédefinido de repetições
          Por exemplo uma atração num parque de diversões em que há um limite de 20 pessoas por vez
          Podemos fazer
        */
        for(int i = 0; i<20; i++){
            System.out.println("Entrada!");
        }
        System.out.println("Atração lotada, aguarde a próxima corrida");
        //Esse algoritimo irá contar a entrada de 20 pessoas na atração e logo em seguida sair do looping de repetição
        //Assim que as 20 pessoas entrarem a frase "Atração lotada, aguarde a próxima corrida" irá aparecer na tela.


        /*A estrutura de repetição while é feita da seguinte forma:
          É descrita uma condição e a estrutura irá se repetir enquanto a condição for verdadeira
        
        while(x == 0){
            Bloco que irá se repetir
        }
          Esse tipo de estrutura é util quando não se pode definir um valor máximo de repetições
          E sim  uma condiçãopara que ela se encerre
          Um exemplo que podemos usar essa estrutura seria num menu
          Podemos fazer:
        */
        Scanner scanner = new Scanner(System.in);
        boolean menu = true;
        while(menu = true){
            System.out.println("1. Iniciar\n2.Sair");
            int choice = scanner.nextInt();
            if(choice == 2){
                menu = false;
            }
        }
        //Esse exemplo aguarda uma entrada do usuário e se inserir o número 2 ele sai da aplicação, definindo a condição de repetição falsa
        //Enquanto o usuário não quiser sair do sistema esse menu continuará na tela e poderá escolher outras opções nele
}
