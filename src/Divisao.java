import java.util.Scanner;

public class Divisao {
    public float valor1;
    public float valor2;

    public Divisao(float n1, float n2) {
        this.valor1 = n1;
        this.valor2 = n2;
    }

    public void dividir() {
        System.out.println("Digite o primeiro número: ");
        Scanner entrada2 = new Scanner(System.in);
        valor1 = entrada2.nextFloat();
        System.out.println("Digite o segundo número: ");
        Scanner entrada3 = new Scanner(System.in);
        valor2 = entrada3.nextFloat();
        double divisao = valor1 / valor2;
        System.out.printf("%.2f / por %.2f  = %.2f \n", valor1, valor2, divisao);
    }
}
