import java.util.Scanner;
public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int[] numbers = new int[10];
        for ( int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter a number:");
            numbers[i] = scanner.nextInt();        
        }
        // check for illegal inputs
        boolean legal = false;
        int index = 0;
        while ( !legal ) {
            System.out.println("Please enter an index between 0-9:");
            index = scanner.nextInt();
            if ( index >= 0 && index <= 9) {
                legal = true;
            }
        }
        System.out.println(numbers[index]);
    }
}