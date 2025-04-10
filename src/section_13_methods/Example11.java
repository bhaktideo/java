package section_13_methods;

public class Example11 {
    static void showListOfNames(String...name)
    {
        for(String target : name)
        {
            System.out.println(target);
        }
    }

    public static void main(String[] args) {

        showListOfNames("Parth","Nayan","Mithilesh","Abdul","Naman","Max","Angela");

    }
}
