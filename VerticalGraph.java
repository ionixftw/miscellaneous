public class VerticalGraph {
    static int[] index, index2;
    public static void main(String[] args) {
        int[] data = {1,9,3,7,5,4};
        int[] data2 = {3,5,9,2,1,6,3,9,0,3,5,6};
        initializeIndex(data, index);
        initializeIndex(data2, index2);
        System.out.println("The Original Data:");
        displayGraph(data, index);
        sortArrayWithIndex(data, index, true);
        System.out.println("Ascending order:");
        displayGraph(data, index, "$$");
        sortArrayWithIndex(data, index, false);
        System.out.println("Descending order:");
        displayGraph(data, index, "[]");
        
    }
    public static void displayGraph(int[] data, int[] index) {
        displayGraph(data, index, "::");
    }
    public static void displayGraph(int[] data, int[] index, String bar) {
        //find maxNumber in data[]
        int max = data[0];
        for ( int i =0; i < data.length-1; i++) {
            if ( data[i+1] > data[i]) {
                max = data[i+1];
            }
        }
        System.out.println();
        // display the graph
        for ( int r = max; r >= 1; r--) {
            for ( int c = 0; c < data.length; c++) {
                if ( r <= data[c] ) {
                    System.out.printf(" %s ", bar);
                } else {
                    System.out.printf("    ");
                }
            }
            System.out.println();
        }
        System.out.println();
        // display index number after graph
        for ( int i = 0; i < data.length; i++ ) {
            System.out.printf(" %02d ", index[i]);
        }
        System.out.println();
        System.out.println();
    }
    public static void sortArrayWithIndex(int[] data, int[] index, boolean ascending) {
        // sort data[] and also swap corresponding index[] to keep track of changes
        if ( ascending ) {
            for (int i = 0; i < data.length - 1; i++ ) {
                for ( int j = 0; j < index.length - i - 1; j++) {
                    if ( data[j] > data[j+1] ) {
                        int temp = data[j];
                        data[j] = data[j+1];
                        data[j+1] = temp;
                        int temp2 = index[j];
                        index[j] = index[j+1];
                        index[j+1] = temp2;
                    }
                }
            }
        } else {
            for (int i = 0; i < data.length - 1; i++ ) {
                for ( int j = 0; j < index.length - i - 1; j++) {
                    if ( data[j] < data[j+1] ) {
                        int temp = data[j];
                        data[j] = data[j+1];
                        data[j+1] = temp;
                        int temp2 = index[j];
                        index[j] = index[j+1];
                        index[j+1] = temp2;
                    }
                }
            }
        }
        
    }
    public static void initializeIndex( int[] data, int[] index) {
        index = new int[data.length];
        for ( int i = 0; i < index.length; i++) {
            index[i] = i + 1;
        }
    }
}