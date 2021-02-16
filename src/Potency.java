import java.util.Scanner;
import java.lang.Math;

public class Potency {
    public float value1;
    public float value2;

    public Potency(float n1, float n2) {
        this.value1 = n1;
        this.value2 = n2;
    }

    public void Raise() {
        System.out.println("Digite a base: ");
        Scanner input2 = new Scanner(System.in);
        value1 = input2.nextFloat();
        System.out.println("Digite o expoente: ");
        Scanner input3 = new Scanner(System.in);
        value2 = input3.nextFloat();
        double potency = Math.pow(value1, value2);
        System.out.printf("%.1f elevado a %.1f = %.2f \n", value1, value2, potency);
    }
}
