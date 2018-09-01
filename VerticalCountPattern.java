import java.util.Scanner;

public class VerticalCountPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of rows to print:");
        int row = scanner.nextInt();
        // count total numbers to print
        int total = 0;
        for ( int i = 1; i <= row; i++ ) {
            total += i;
        }
        System.out.println("This pattern consists of " + total + " numbers.");
        for (int r = 1; r <= row; r++) {
            int number = r;
            for ( int c = 1; c <= r; c++) {
                System.out.printf("%4d", number);
                number =  number + row - c;
            }
            System.out.println();
        }

    }
}