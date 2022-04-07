package Class_7.Exercicios.Exe2;

public class Calculadora {
        //somar
        public double operacao(double num1, double num2) {
            return num1+num2;            
        }

        //subtrair
        public double operacao(int num1, double num2) {
            return num1-num2;
        }

        //produto
        public double operacao(double num1,  int num2) {
            return num1*num2;
        }

        //divisão
        public double operacao(int num1, int num2) {
            return num1/num2;
        }

        //resto da divisão
        public double operacao(int num1, short num2) {
            return num1%num2;
        }
}
