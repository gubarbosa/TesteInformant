import java.util.Scanner;

public class Raiz {
    public float valor1;
    public float valor2;

    public Raiz(float n1, float n2) {
        this.valor1 = n1;
        this.valor2 = n2;
    }

    public void radiciacao() {
        System.out.println("Digite o índice ");
        Scanner entrada2 = new Scanner(System.in);
        valor1 = entrada2.nextFloat();
        System.out.println("Digite o radical ");
        Scanner entrada3 = new Scanner(System.in);
        valor2 = entrada3.nextFloat();
        double raiz = Math.pow(valor2, (float)1/valor1);
        System.out.printf("A raiz do radical %.1f com índice %.1f = %.2f \n" , valor2, valor1, raiz);
    }
}
