import java.util.Scanner;

public class Class_4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        * int x = 5, y = 0;
        * y =x++ + ++x; //Operadores pré-fixados e pós fixados
        * System.out.println(y);
        */

        /* Números de 0 a 50
        * for(int i =0; i<=50; i++){
        *    System.out.println(i);
        */
        

        /*
        
        int idade, sum = 0;
        for(int i = 0; i<5; i++){
            idade = scanner.nextInt();
            sum += idade;
        }
        System.out.println(sum);;
        
        */

        /*
        for(int i =100; i>0; i--){
            System.out.println(i);
        }
        */

        /*
        for (int i = 15; i <= 100; i++) {
            System.out.printf("%d - %d\n",i, i*i);
        }
        */
        
        /*
        int entrada = scanner.nextInt();
        for(int i = entrada; i >= 0; i--){
            System.out.println(i);
        }
        */

        float nota1, nota2, media = 0, MediaG = 0;;
        int cAprov = 0, cExam = 0, cReprov = 0, cMedias = 0; 
        for(int i = 0; i<6; i++){
            nota1 = scanner.nextFloat();
            nota2 = scanner.nextFloat();
            media = (nota1 + nota2)/2;
            cMedias ++;
            MediaG += media;
            System.out.println(media);
            if(media >= 7){
                System.out.println("Aprovado");
                cAprov ++;
            }else if(media >= 3 && media <= 7){
                System.out.println("Exame");
                cExam ++;
            }
            else{
                System.out.println("Reprovado");
                cReprov ++;
            }
        }
        System.out.printf("Aprovados: %d\nExame: %d\nReprovado: %d\n",cAprov, cExam, cReprov);
        System.out.printf("%.1f",MediaG/cMedias);

        scanner.close();
    }
}