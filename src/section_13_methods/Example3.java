package section_13_methods;

public class Example3 {

    // Display matrix

    public static void display(int[][] array){
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{3,2,4}, {2,7,8}};
        display(arr);
    }
}
