import java.util.Scanner;

public class Multiplicacao {
    public float valor1;
    public float valor2;

    public Multiplicacao(float n1, float n2) {
        this.valor1 = n1;
        this.valor2 = n2;
    }

    public void multiplicar() {
        System.out.println("Digite o primeiro número: ");
        Scanner entrada2 = new Scanner(System.in);
        valor1 = entrada2.nextFloat();
        System.out.println("Digite o segundo número: ");
        Scanner entrada3 = new Scanner(System.in);
        valor2 = entrada3.nextFloat();
        float multiplica = valor1 * valor2;
        System.out.printf("%.1f x %.1f=%.1f \n", valor1, valor2, multiplica);
    }
}
