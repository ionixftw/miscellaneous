// Create a program for calculating the average grade of students of a class
/* Pseudocode
 We need total and gradeCounter to calculate the average
 1: initialize total to zero
 2: intialize counter to zero
 3: Prompt the user for a grade and store the value in grade variable
 4: while grade is not equal to sentinel value
        if the grade is between 0 and 100
            add grade to total
            increase gradeCounter by 1
        else
            Print "The grade is not valid. It must be between 0 and 100"
        prompt the user for next grade
        store the grade in grade variable
 5: if counter is not equal to zero
        calculate average by dividing total by gradeCounter
        Print the average
    else 
        Print "No grades were entered"
 6: End
*/
import java.util.Scanner;
public class ClassAverage {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        // initialize variables 
        int total = 0;
        int gradeCounter = 0;
        // prompt
        System.out.println("Please enter grade or enter -1 to stop:");
        int grade = scanner.nextInt();

        while ( grade != -1 ) {
            if ( grade >= 0 && grade <= 100 ) {
                //add grade to total
                total += grade;
                //increment gradeCounter
                gradeCounter++;
                // prompt the user for next grade
            } else {
                // invalid grade
                System.out.println("The grade is not valid. It must be between 0 and 100");
            }
            System.out.println("Please enter grade or -1 to stop:");
            grade = scanner.nextInt();
        }

        if ( gradeCounter != 0 ) {
            // calculate average
            double average = (double) total / gradeCounter;
            // print total grades counter
            System.out.printf("%nTotal of the %d grades entered is %d%n", gradeCounter, total);
            // print average
            System.out.printf("%nTotal class average: %.2f%n", average);
        } else {
            System.out.println("No grades were entered!");
        }

    }
}