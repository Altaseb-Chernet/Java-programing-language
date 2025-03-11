import java.util.Scanner;

class Calculator{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("enter the second number: ");
        double num2 = scanner.nextDouble();
        double sum = num1 + num2;
        double difference = num1-num2;
        double multiply = num1*num2;
        double division = num1 / num2;
        double remainder = num1 % num2;
        System.out.printf("sum: %f\n",sum);
        System.out.printf("difference: %f\n",difference);
        System.out.printf("multiply: %f\n",multiply);
        System.out.printf("division: %f\n",division);
        System.out.printf("remainder: %f\n",remainder);
        scanner.close();
    }
}
