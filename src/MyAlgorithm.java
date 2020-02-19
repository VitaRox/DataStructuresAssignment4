import java.util.Arrays;

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
    public static int[][] impAlgo(int[][] inputArray) {

        // 'Size' allows the method to be dynamic and easily refactorable;
//        int size = inputArray.length;

        // Create new array for output;
        int[][] outputArray = new int[5][5];

        /*
         Initialize min to the value of the first element of the first array in
         our inputArray;
         Use 'min' to compare the values of the first elements of each internal array;
        */
        int min;

        /*
         Only iterate through rows, since we are unconcerned with any columns
         save for the first one in each row (each internal array of 'inputArray');
        */
        for (int row = 0; row < 5; row++) {
            min = inputArray[row][0];
            int remainder;
            // tempArray holds whichever array holds the current min as its first element;
            int[] tempArray;
            for (remainder = row + 1; remainder < 5; remainder++) {
                // Test next first value of internal array against min;
                if (inputArray[remainder][0] < min) {
                    // Reassign value of 'min' if that element is < min;
                    min = inputArray[remainder][0];
                    // Reassign tempArray so as to keep a reference to this internal array;
                    tempArray = inputArray[remainder];
                }

//                outputArray[remainder] = Arrays.copyOf(tempArray);
//                }
//                }
//            }
//        }
//        return outputArray;
            }

            public static void main (String[]args){

                // Our array to test algorithm;
                int[][] testArray = {
                        {1, 2, 3, 4, 5},
                        {3, 4, 5, 1, 2},
                        {5, 2, 3, 4, 1},
                        {2, 3, 1, 4, 5},
                        {4, 2, 3, 1, 5}
                };
                int[][] test = new int[5][5];
                int[] test2 = {1, 2, 3, 4, 5};
                for (int[] elem : test) {
                    elem = test2;
                }
                System.out.println(test[0][2]);


                //int[][] newArray = impAlgo(testArray);
//        for (int[] elem : newArray) {
//            System.out.print("" + elem + "");
//        }
//        for (int row = 0; row < 5; row++) {
//            for (int col = 0; col < 5; col++) {
//                System.out.print(newArray[row][col] + ", ");
//            }
//            System.out.println();
//        }

                // System.out.println(testArray[row(array)][col(element)]);
                // Done to understand how data being passed;
//        System.out.println(testArray[0][0]);
//        System.out.println(testArray[1][0]);
//        System.out.println(testArray[2][0]);
            }
        }

    }
}