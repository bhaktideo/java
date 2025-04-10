package section_11_loops;

public class Example14 {
    public static void main(String[] args) {

        // Infinite loop with an invalid termination condition

        int x = 0;

        while (x>=0){
            System.out.println("Hello");
            x++;
        }
    }
}

/*
int x = 0;
for(; x>=0; x++){
System.out.println("Hello")
}
 */