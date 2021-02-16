import java.util.Scanner;

public class Factorial {
    public float value1;
    public float value2;

    public Factorial(float n1, float n2) {
        this.value1 = n1;
        this.value2 = n2;
    }

    public void Calculate() {
        System.out.println("Digite o número: ");
        Scanner input2 = new Scanner(System.in);
        float value1 = input2.nextFloat();
        float value2 = value1;
        float chosen_number = value1;
        if (value1 == 0) {
            System.out.printf("%.0f! = 1\n", value1);
        } else {
            while(value2 > 1) {
                value1 = value1 * (value2 - 1); value2--;
            }
            System.out.printf("%.0f! = %.0f \n" , chosen_number, value1);
            }
    }
}
