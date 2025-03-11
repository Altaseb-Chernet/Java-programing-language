import java.util.Scanner;

class Calculator{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.println("enter the Second number: ");
        double num2 = scanner.nextDouble();
        double sum = num1 + num2;
        double sub = num1 - num2;
        double mul = num1 * num2;
        double div = num1 / num2;
        System.out.printf("sum: %f\n",sum);
        System.out.printf("sub: %f\n",sub);  
        System.out.printf("mul: %f\n",mul);
        System.out.printf("div: %f\n",div);
        scanner.close();

    }
}