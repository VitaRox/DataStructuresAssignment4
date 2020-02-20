/**
 * @author Vita.Wiebe@seattlecolleges.edu
 * This class defines a method which implements the selectionSort sorting algorithm;
 * O(n^2) for the sorting;
 */
public class MyAlgorithm {

    /**
     * Pre: A filled 2D array to be sorted;
     * Post: The inputArray, sorted in ascending order according to the first
     * element of the inner (column) element;
     * @param inputArray a 2D array of ints to be sorted according to first index elem of
     *                   each internal array;
     */
    public static int[][] impAlgo(int[][] inputArray) {

        /*
         Only iterate through rows, since we are unconcerned with any columns
         save for the first one in each row (each internal array of 'inputArray');
         Ignore last row, as it will have been sorted by the time algorithm reaches that point,
         and would have nothing to compare to;
        */
        for (int row = 0; row < 4; row++) {

            // 'remainder' is the index of an element in the unsorted part of the array;
            int remainder;
            // 'windex' stores the index (row) corresponding to the "winning" (next) row;
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

            // Swap places of the current row for the next "min" row;
            for(int col = 0; col < 5; col++) {

                // Two temp variables to hold value at current col of next min row;
                int tempMin = inputArray[windex][col];
                int tempRow = inputArray[row][col];

                // Swap the arrays at [row] and [windex];
                inputArray[row][col] = tempMin;
                inputArray[windex][col] = tempRow;
            }
        }
        // Return our sorted-in-ascending-order-by-first-element-of-each-row array;
        return inputArray;
    }

    /**
     * Our application method;
     * Use dummy 2D array, 'testArray', to test the impAlgo() method above;
     * @param args
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

        // nuArray will be our output;
        int[][]nuArray = impAlgo(testArray);

        // Pretty-print each internal array (columns) of our larger array (rows);
        for(int row = 0; row < 5; row++) {
            System.out.print("{");
            for (int col = 0; col < 4; col++) {
                System.out.print(nuArray[row][col] + ",");
            }
            System.out.print(nuArray[row][4] + "}");
            System.out.println();
        }
    }
}


