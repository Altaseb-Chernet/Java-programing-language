import java.util.Scanner;
class MainClass{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.printf("my name is %s ",name);
        int age = scanner.nextInt();
        System.out.printf("i am %d years old ",age);
        scanner.close();
    }
}