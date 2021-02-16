import java.util.Scanner;

public class Plus {
    public float value1;
    public float value2;

    public Plus(float n1, float n2) {
        this.value1 = n1;
        this.value2 = n2;
    }

    public void Add() {
        System.out.println("Digite o primeiro número: ");
        Scanner input2 = new Scanner(System.in);
        float value1 = input2.nextFloat();
        System.out.println("Digite o segundo número: ");
        Scanner input3 = new Scanner(System.in);
        float value2 = input3.nextFloat();
        float plus = value1 + value2;
        System.out.printf("%.1f + %.1f = %.1f \n", value1, value2, plus);
    }
}