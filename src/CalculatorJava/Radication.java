package CalculatorJava;

import java.util.Scanner;

public class Radication {
    public float value1;
    public float value2;

    public Radication(float n1, float n2) {
        this.value1 = n1;
        this.value2 = n2;
    }

    public void Root() {
        System.out.println("Digite o índice ");
        Scanner input2 = new Scanner(System.in);
        value1 = input2.nextFloat();
        System.out.println("Digite o radical ");
        Scanner input3 = new Scanner(System.in);
        value2 = input3.nextFloat();
        double radication = Math.pow(value2, (float)1/value1);
        System.out.printf("A raiz do radical %.1f com índice %.1f = %.2f \n" , value2, value1, radication);
    }
}
