/**
 * @author Vita.Wiebe@seattlecolleges.edu
 *
 */
public class MyAlgorithm {

    /**
     * @param inputArray a 2D array of ints to be sorted according to first index elem of
     *                   each internal array;
     * @return outputArray, the algorithm-sorted version of our inputArray;
     */
    public static int[][] impAlgo(int[][]inputArray){

        // 'Size' allows the method to be dynamic and easily refactorable;
        int size = inputArray.length;

        // Create new array for output;
        int[][] outputArray = new int[size][size];

        /*
         Initialize min to the value of the first element of the first array in
         our inputArray;
         Use 'min' to compare the values of the first elements of each internal array;
        */
        int min = inputArray[0][0];

        /*
         Only iterate through rows, since we are unconcerned with any columns
         save for the first one in each row (internal array, our 'inputArray');
        */
        for(int row = 1; row < size; row++){
            // Test next first value of internal array against min;
            if(inputArray[row][0] < min) {
                // Reassign value of 'min' if that element is < min;
                min = inputArray[row][0];
                for(int col = 0; col < size; col++) {
                    outputArray[row][col] = inputArray[row][col];
                }
            }
        }
        return outputArray;
    }


    public static void main(String[] args) {

        int[][] testArray = {
                {1, 2, 3, 4, 5},
                {3, 4, 5, 1, 2},
                {5, 2, 3, 4, 1},
                {2, 3, 1, 4, 5},
                {4, 2, 3, 1, 5}
        };
        int[][] newArray = impAlgo(testArray);
        System.out.println(newArray.toString());

        // System.out.println(testArray[row(array)][col(element)]);
        // Done to understand how data being passed;
        System.out.println(testArray[0][0]);
        System.out.println(testArray[1][0]);
        System.out.println(testArray[2][0]);

    }


}
