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

        /*
         Only iterate through rows, since we are unconcerned with any columns
         save for the first one in each row (each internal array of 'inputArray');
        */
        for (int row = 0; row < 4; row++) {
            int remainder;
            int windex = 0;
            /*
             Initialize min to the value of the first element of the first array in
             our inputArray;
             Use 'min' to compare the values of the first elements of each internal array;
            */
            int min = inputArray[row][0];
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
            // Put the next min array into the first, sorted part of the overarching array;
            for(int col = 0; col < 5; col++) {
                // Two temp variables to hold value at current col of next min row;
                int tempMin = inputArray[windex][col];
                int tempRow = inputArray[row][col];
                // Swap the arrays at [row] and [windex];
                inputArray[row][col] = tempMin;
                inputArray[windex][col] = tempRow;
            }
            // Continue search new, unsorted remainder of the inputArray;
        }

//            // Print stuff:
//            // Fencepost: print first item in list with opening curly brace;
//            System.out.print("{" + inputArray[row][0] + ",");
//            // Print middle of next inner array, comma-separated;
//            for (int col = 1; col < 4; col++) {
//                System.out.print(inputArray[row][col] + ",");
//            }
//            // Fencepost end: print last value in inner array, close with curly brace;
//            System.out.println(inputArray[row][4] + "}");
        return inputArray;
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


