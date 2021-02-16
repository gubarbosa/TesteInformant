import java.util.Scanner;
public class Calculator {

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
                    [7] --> Fatorial\s
                    [8] --> Sair da calculadora""");
            System.out.print("Escolha a operação: ");
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            if (choice == 1) {
                float value1 = 0;
                float value2 = 0;
                Plus obj1 = new Plus(value1, value2);
                obj1.Add();
            } else if (choice == 2) {
                float value1 = 0;
                float value2 = 0;
                Multiplication obj2 = new Multiplication(value1, value2);
                obj2.Multiply();
            } else if (choice == 3) {
                float value1 = 0;
                float value2 = 0;
                Division obj3 = new Division(value1, value2);
                obj3.Divide();
            } else if(choice == 4) {
                float value1 = 0;
                float value2 = 0;
                Subtraction obj4 = new Subtraction(value1, value2);
                obj4.Subtract();
            } else if(choice == 5) {
                float value1 = 0;
                float value2 = 0;
                Potency obj5 = new Potency(value1, value2);
                obj5.Raise();
            } else if(choice == 6) {
                float value1 = 0;
                float value2 = 0;
                Radication obj6 = new Radication(value1, value2);
                obj6.Root();
            } else if(choice ==7) {
                float value1 = 0;
                float value2 = 0;
                Factorial obj7 = new Factorial(value1, value2);
                obj7.Calculate();
            } else if(choice == 8) {
                break;
            }
        }    }
    }
