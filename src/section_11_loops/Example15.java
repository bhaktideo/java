package section_11_loops;

public class Example15 {
    public static void main(String[] args) {

        // Nested loops

        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.printf("(%d, %d)\n", i ,j);
            }
        }
    }
}
