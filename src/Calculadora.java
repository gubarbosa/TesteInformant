import java.util.Scanner;
public class Calculadora {

    public static void main(String[] args){
        while (true){
            System.out.println("""
                    CALCULADORA JAVA\s
                    [1] --> Somar\s
                    [2] --> Multiplicar\s
                    [3] --> Dividir\s
                    [4] --> Subtrair\s
                    [5] --> Potência\s
                    [6] --> Radiciação\s
                    [7] --> Sair da calculadora""");
            System.out.print("Escolha a operação: ");
            Scanner entrada1 = new Scanner(System.in);
            int escolha = entrada1.nextInt();
            if (escolha == 1) {
                float valor1 = 0;
                float valor2 = 0;
                Soma somar = new Soma(valor1, valor2);
                somar.somar();
            } else if (escolha == 2) {
                float valor1 = 0;
                float valor2 = 0;
                Multiplicacao multiplicar = new Multiplicacao(valor1, valor2);
                multiplicar.multiplicar();
            } else if (escolha == 3) {
                float valor1 = 0;
                float valor2 = 0;
                Divisao dividir = new Divisao(valor1, valor2);
                dividir.dividir();
            } else if(escolha == 4) {
                float valor1 = 0;
                float valor2 = 0;
                Subtracao subtrair = new Subtracao(valor1, valor2);
                subtrair.subtrair();
            } else if(escolha == 5) {
                float valor1 = 0;
                float valor2 = 0;
                Potencia potenciacao = new Potencia(valor1, valor2);
                potenciacao.potenciacao();
            } else if(escolha == 6) {
                float valor1 = 0;
                float valor2 = 0;
                Raiz radiciacao = new Raiz(valor1, valor2);
                radiciacao.radiciacao();
            } else if(escolha == 7) {
                break;
            }
        }    }
    }
