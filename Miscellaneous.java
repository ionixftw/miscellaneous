import java.util.Scanner;

public class Miscellaneous {
    public static int[] array = new int[20];    
    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in );
        for ( int i = 0; i < array.length; i++ ) {
            array[i] = ( int ) ( Math.random() * 100000 + 1);
        }
        System.out.println("The original array was: ");
        printArray();
        long startTime = System.currentTimeMillis();
        for ( int i = 0; i < array.length - 1; i++ ) {
            int maxLocation = i;
            for ( int j = i + 1; j < array.length; j++ ) {
                if ( array[j] > array[maxLocation] ) {
                    maxLocation = j;
                }
            }
            int temp = array[i];
            array[i] = array[maxLocation];
            array[maxLocation] = temp;
        }
        System.out.println("Descending order with selection sort: ");
        printArray();
        // for ( int i = 0; i < array.length; i++ ) {
        //     for ( int j = array.length - 1; j >= 1; j-- ) {
        //         if ( array[j] < array[j - 1]) {
        //             int temp = array[j];
        //             array[j] = array[j - 1];
        //             array[j - 1] = temp;
        //         }
        //     }
        // }
        // System.out.println("Ascending order with bubble sort: ");
        // printArray();
        long endTime = System.currentTimeMillis();
        System.out.println("Total time: " + (endTime - startTime) + " milliseconds.");
        
    }
    public static void printArray() {
        System.out.printf("{ ");
        for ( int i = 0; i < array.length; i++ ) {
            if ( i != array.length - 1 )
                System.out.printf("\"%d\", ", array[i]);
            else
                System.out.printf("\"%d\"", array[i]);
        }
        System.out.printf(" }");
        System.out.println();
    }
}