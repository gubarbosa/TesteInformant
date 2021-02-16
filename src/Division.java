import java.util.Scanner;

public class Division {
    public float value1;
    public float value2;

    public Division(float n1, float n2) {
        this.value1 = n1;
        this.value2 = n2;
    }

    public void Divide() {
        System.out.println("Digite o primeiro número: ");
        Scanner input2 = new Scanner(System.in);
        value1 = input2.nextFloat();
        System.out.println("Digite o segundo número: ");
        Scanner input3 = new Scanner(System.in);
        value2 = input3.nextFloat();
        double division = value1 / value2;
        System.out.printf("%.2f / por %.2f  = %.2f \n", value1, value2, division);
    }
}
