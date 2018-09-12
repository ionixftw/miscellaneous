import java.util.Scanner;

public class SelfReview {
    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in );
        //factorial
        // int x = 1, product = 1;
        // while ( x < 11 ) {
        //     product *= x++;
        // }
        // int y = 1, sum = 0;;
        // x = 1;
        // System.out.println("Factorial 10 is: " + product );
        // sum = x + y;
        // System.out.println("SUM: " + ++sum);
        // Chceckboard Pattern
        int r = 1;
        while ( r <= 5 ) {
            int c = 1;
            while ( c <= 5 ) {
                if ( r % 2 == 0 ) {
                    System.out.printf(" *");
                } else {
                    System.out.printf("* ");
                }
                c++;
            }
            System.out.println();
            r++;
        }

        // Sides of a triangle
        // int a = scanner.nextInt();
        // int b = scanner.nextInt();
        // int c = scanner.nextInt();
        // if ( a + b > c ) {
        //     System.out.println("Look! A triangle!");
        // } else {
        //     System.out.println(" No triangles!");
        // }
        
        // Sides of a right triangle 
        // int a = scanner.nextInt();
        // int b = scanner.nextInt();
        // int c = scanner.nextInt();
        // // find max side
        // int max = a > b ? a > c ? a : c : b > c ? b : c;
        // max *= max;
        // if ( (max == a * a + b * b) || (max == a * a + c * c ) ) {
        //     System.out.println("Right triangle is possible!");
        // } else {
        //     System.out.println("Sorry!. No Right triangle for you. :(");
        // }

        // Factorial recursion
        // System.out.println("Factorial 5 is: " + factorial(5));

        // calculate the value of e
        System.out.print("Please enter the power of e followed by the number of terms n: ");
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        double e = 1.0;
        for ( int i = 1; i <= n; i++ ) {
            e += Math.pow(x,i) / factorial(i);
        }
        System.out.printf("The value of e to the power %d is %f%n", x, e);

    }
    public static int factorial(int n) {
        if ( n < 0 ) 
            return -1;
        if ( n == 1 )
            return 1;
        return n * factorial( n - 1);
    }
}