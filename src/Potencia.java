import java.util.Scanner;
import java.lang.Math;

public class Potencia {
    public float valor1;
    public float valor2;

    public Potencia(float n1, float n2) {
        this.valor1 = n1;
        this.valor2 = n2;
    }

    public void potenciacao() {
        System.out.println("Digite a base: ");
        Scanner entrada2 = new Scanner(System.in);
        valor1 = entrada2.nextFloat();
        System.out.println("Digite o expoente: ");
        Scanner entrada3 = new Scanner(System.in);
        valor2 = entrada3.nextFloat();
        double potencia = Math.pow(valor1, valor2);
        System.out.printf("%.1f elevado a %.1f = %.2f \n", valor1, valor2, potencia);
    }
}
