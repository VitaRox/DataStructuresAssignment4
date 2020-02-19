/**
 * @author Vita.Wiebe@seattlecolleges.edu
 *
 */
public class MyAlgorithm {

    /**
     * Pre: A filled 2D array to be sorted;
     * Post: Print the input array, but sorted in ascending order according to the first
     * element of the inner (column) element;
     * @param inputArray a 2D array of ints to be sorted according to first index elem of
     *                   each internal array;
     */
    public static int[][] impAlgo(int[][] inputArray) {

        // Create new array for output;
        int[][] outputArray = new int[5][5];

        /*
         Only iterate through rows, since we are unconcerned with any columns
         save for the first one in each row (each internal array of 'inputArray');
        */
        for (int row = 0; row < 5; row++) {
            int remainder;
            /*
             Initialize min to the value of the first element of the first array in
             our inputArray;
             Use 'min' to compare the values of the first elements of each internal array;
            */
            int min = inputArray[row][0];
            // 'windex' will be used to store the row index of the next array to
            // place in outArray;
            int windex = 0;
            // Selection sort: search rest of array for next minimum element at head;
            for (remainder = row + 1; remainder < 5; remainder++) {
                // Test next first value of internal array against min;
                if (inputArray[remainder][0] < min) {
                    // Reassign value of 'min' if that element is < min;
                    min = inputArray[remainder][0];
                    // 'windex' tracks the winning row index of inputArray;
                    windex = remainder;
                }
            }

            // Copy elements in winning row
            // of internal array to next internal array in outputArray;
            for (int col = 0; col < 5; col++) {
                outputArray[row][col] = inputArray[windex][col];
            }

            // Print stuff:
            // Fencepost: print first item in list with opening curly brace;
//            System.out.print("{" + outputArray[row][0] + ",");
//            // Print middle of next inner array, comma-separated;
//            for (int col = 1; col < 4; col++) {
//                System.out.print(outputArray[row][col] + ",");
//            }
//            // Fencepost end: print last value in inner array, close with curly brace;
//            System.out.println(outputArray[row][4] + "}");
        }
        return outputArray;
    }

    /**
     * Our application method;
     * Use dummy 2D array, 'testArray', to test the impAlgo() method above;
     * @param args fuck
     */
    public static void main (String[] args) {

        // Our array to test algorithm;
        int[][] testArray = {
                {1, 2, 3, 4, 5},
                {3, 4, 5, 1, 2},
                {5, 2, 3, 4, 1},
                {2, 3, 1, 4, 5},
                {4, 2, 3, 1, 5}
        };
        int[][]nuArray = impAlgo(testArray);
        for(int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print(nuArray[row][col]);
            }
            System.out.println();
        }
    }
}


