import java.util.Scanner;
public class HourMinuteCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in );
        int initialHour = 0, initialMinute = 0, finalHour = 0, finalMinute = 0,
            hourDiff = 0, minuteDiff = 0;
        System.out.println("Please enter the initial hour:");
        initialHour = scanner.nextInt();
        System.out.println("Please enter the initial minute:");
        initialMinute = scanner.nextInt();
        System.out.println("Please enter the final hour: ");
        finalHour = scanner.nextInt();
        System.out.println("Please enter the final minute: ");
        finalMinute = scanner.nextInt();
        if ( finalHour > initialHour ) {
            hourDiff = finalHour - initialHour;
            if ( finalMinute >= initialMinute ) {
                // input: 7 8 8 8 output: 1 hours 0 minutes
                minuteDiff = finalMinute - initialMinute;
            } else {
                // input: 7 8 8 7 output: 0 hours 59 minutes
                minuteDiff = finalMinute - initialMinute + 60;
                hourDiff--;
            }
        } else if ( finalHour < initialHour ) {
            hourDiff = finalHour - initialHour + 24;
            if ( finalMinute >= initialMinute ) {
                //input: 7 8 6 8 output: 23 hours 0 minute
                minuteDiff = finalMinute - initialMinute;
            } else {
                // input 7 8 6 7 output: 22 hours 59 minutes
                minuteDiff = finalMinute - initialMinute + 60;
                hourDiff--;
            }
        } 
        // else if  is not needed, only else will also do, but for human readability
        // else if  is used here.
        else if (finalHour == initialHour ) { 
            if( finalMinute > initialMinute ) {
                // input: 7 8 7 10 output: 2 minutes
                hourDiff = finalHour - initialHour;
                minuteDiff = finalMinute - initialMinute;
            } else if (finalMinute < initialMinute ) {
                // input: 7 8 7 6 output: 23 hours 59 minutes
                hourDiff = finalHour - initialHour + 24;
                minuteDiff = finalMinute - initialMinute + 60;
                hourDiff--;
            } 
            // else if  is not needed, only else will also do, but for human readability
            // else if  is used here.
            else if ( finalMinute == initialMinute) { 
                // input: 7 8 7 8 output: 24 hours
                hourDiff = finalHour - initialHour + 24;
                minuteDiff = finalMinute - initialMinute;
            }
        }
        System.out.printf("Time Difference: %02d hour(s) %02d minute(s)%n%n", hourDiff, minuteDiff);
    }
}