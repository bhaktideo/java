package section_13_methods;

import java.util.Arrays;

public class Example14 {

    // Array multiplication

    static int[][] multiply(int[][] A, int[][] B){

        int[][] C = new int[3][3];
        for (int i=0; i<A.length; i++){
            for (int j=0; j<A[i].length; j++){
                for (int k=0; k<A[i].length; k++){
                    C[i][j] += (A[i][k] * B[k][j]);
                }
            }
        }
        return C;
    }

    public static void main(String[] args) {

        int[][] array1 = {{1,2,3}, {4,5,6}, {1,2,3}};
        int[][] array2 = {{1,4,2}, {1,6,4}, {7,5,4}};

        int[][] array = multiply(array1, array2);

        System.out.println(Arrays.deepToString(array));
    }
}
