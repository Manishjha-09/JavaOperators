import java.util.Scanner;

public class JavaOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Q1. Write a program to add 8 to the number x and then divide it by 3. Now, the modulus of the quotient
//        is taken with 5 and then multiply the resultant value by 5. Display the final result.
        int xNum = sc.nextInt();
        int add8 = xNum+8;
        int divide = add8/3;
        int modlus = divide%5;
        int result = modlus*5;
        System.out.println(result);

//        Q2. Swap two numbers without the use of third variable.
        System.out.print("Enter The first Number: ");
        int first = sc.nextInt();
        System.out.print("Enter The Second Number: ");
        int second = sc.nextInt();
        first = first + second;
        second = first - second;
        first = first - second;
        System.out.println(first);
        System.out.println(second);

//          Q3. Write a program to calculate the sum of the digits of a 3-digit number.
        System.out.print("Enter 3 Digit number: ");
        int num = sc.nextInt();
        int ans = 0;
        for (int i = num; i>0; ){
            ans = ans + i%10;
            i = i/10;
        }
        System.out.println(ans);

//        Q4. Assign values of variables 'a' and 'b' as 55 and 70 respectively and then check if:
        int a = 55;
        int b = 70;
        System.out.println( a < 50 && a < b );
        System.out.println( a < 50 || a < b );

//        Q5. - Find the total number of bits needed to be flipped to convert x to y.
        System.out.print("Enter the first Number: ");
        int x = sc.nextInt();
        System.out.print("Enter the second Number: ");
        int y = sc.nextInt();
        int i = x ^ y;
        int numOfBits = 0;
        while (i != 0){
            i = i & (i - 1);
            numOfBits++;
        }
        System.out.print(numOfBits);
    }
}