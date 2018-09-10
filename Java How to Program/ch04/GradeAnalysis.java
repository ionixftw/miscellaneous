// Analyze exam results and decide whether bonus should be awarded to instructor
import java.util.Scanner;
public class GradeAnalysis{
    public static void main ( String[] args ) {
        // initialize variables
        int pass = 0;
        int fail = 0
        int students = 10;
        // input 10 students marks and perform assignments
        for ( int counter = 1; counter <= 10; counter++ ) {
            Scanner scanner = new Scanner ( System.in );
            // prompt
            System.out.println("Enter marks ( 1 == pass) (2 == fail)");
            int mark = scanner.nextInt();
            if ( mark == 1)
                pass++;
            else
                fail++;
            
        }
        // print total pass and fail
        System.out.println( " Total Passed: " + pass);
        System.out.println( " Total Fail: " + fail);
        // bonus to teacher if pass > 8
        if ( pass > 8 ) {
            System.out.println("Bonus to instructor!!");
        }
    }
}