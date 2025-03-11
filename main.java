class Main{
    static int age;
    public static void main(String[] args) {
       
        System.out.println("===========simple calculator==========");

        int num1 = 8, num2 = 6, sum , difference, product, division, remainder;

         sum = num1 + num2;
         difference = num1 - num2;
         product = num1 * num2;
         division = num1 / num2;
         remainder = num1 % num2;
        System.out.println("sum: "+ sum);
        System.out.println("difference: "+ difference);
        System.out.println("product: "+ product);
        System.out.println("division: "+ division);
        System.out.println("remainder: "+ remainder);

        System.out.println("=====================");

    }
}