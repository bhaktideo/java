package section_12_arrays;

public class Example11 {
    public static void main(String[] args) {

        // 2D array matrix multiplication

        int[][] A = {{1,2,1}, {3,2,1}, {5,4,1}};
        int[][] B = {{6,1,2}, {5,4,2}, {6,2,0}};
        int[][] C = new int[3][3];

        for (int i=0; i<A.length; i++){
            for (int j=0; j<A[i].length; j++){
                for (int k=0; k<A[i].length; k++){
                    C[i][j] += (A[i][k] * B[k][j]);
                }
            }
        }

        for (int i=0; i<A.length; i++){
            for (int j=0; j<A[i].length; j++){
                    System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
