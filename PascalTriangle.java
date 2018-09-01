import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // prompt the user for row count
        System.out.println("Please enter the number of rows you want me to print: ");
        int row = scanner.nextInt();

        for ( int r = 0; r < row; r++ ) {
            // print spaces
            System.out.printf("%" + ( row - r ) + "s","");
            long number = 1;
            // print numbers
            for ( int c = 0; c <= r; c ++ ){
                if ( number % 2 == 1 )
                    System.out.printf("1 ");
                else 
                    System.out.printf("  ");
                number = number * ( r - c ) / ( c + 1 );
            }
            System.out.println();
        }

        
        // int n = 5;
 
        // for (int i = 0; i < n; i++) {
        //     int number = 1;
        //     System.out.printf("%" + (n - i) * 2 + "s", "");
        //     for (int j = 0; j <= i; j++) {
        //         System.out.printf("%4d", number);
        //         number = number * (i - j) / (j + 1);
        //     }
        //     System.out.println();
        // }
    }
}