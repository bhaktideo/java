package section_12_arrays;

public class Example10 {
    public static void main(String[] args) {

        // 2D array matrix addition

        int[][] A = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] B = {{1,0,1}, {0,1,0}, {1,1,0}};
        int[][] C = new int[3][3];

        for (int i=0; i< A.length; i++){
            for (int j=0; j<A[i].length; j++){
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        for (int i=0; i< A.length; i++){
            for (int j=0; j<A[i].length; j++){
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
