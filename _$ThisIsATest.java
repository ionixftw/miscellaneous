import java.util.Scanner;

public class _$ThisIsATest {
    public static void main(String[] args ) {
        long timeStart = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        for ( int i = 2; i <= 100;  i++ ) {
            if ( i % 2 == 0) {

            }
            else {
                int count = 0;
                for ( int j = 1; j <= i; j++ ) {
                    if ( i % j == 0 )
                        count++;
                }
                if ( count == 2 ) {
                    System.out.print(i + " ");
                }
            }
        }
        // for ( int i = 1; i < 1000; i++ ) {
        //     System.out.println("Badingaa dind da ding da ding da ding da da da .");
        //     System.out.println("Parvez.Yalla Habibi.");
        //     System.out.println("Please stop saying please everytime, this is a test.");
        // }
        // System.out.print("This is sparta.\r");
        // System.out.print("This is America.\n");
        // int number1, number2, sum;
        // System.out.println("Please enter number1: ");
        // number1 = scanner.nextInt();
        // System.out.println("Please enter number 2: ");
        // number2 = scanner.nextInt();
        // sum = number1 + number2;
        // char ch = '\t';
        // System.out.printf("Sum is: \r %c%d", ch, sum);
        // System.out.printf(" . This is Sparta~");
        
        long timeEnd = System.currentTimeMillis();
        System.out.println("Total execution time: " + (timeEnd - timeStart) + " milliseconds.");

    }
}



