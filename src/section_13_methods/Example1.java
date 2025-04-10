package section_13_methods;

public class Example1 {

        static int max(int x, int y)
        {
            if(x>y)
            {
                return x;
            }
            else
            {
                return y;
            }
        }

        int min(int x, int y)
        {
            if(x < y)
            {
                return x;
            }
            else
            {
                return y;
            }
        }

        void modifyPrimitives(int x)
        {
            System.out.println("Function: " + x);
            x++;
            System.out.println("Function : " + x);
        }

        // static method can call static methods only
        public static void main(String[] args)
        {
            int a = 10;
            int b = 15;

            int c = max(a,b);
            System.out.println("Max : " + c);

            Example1 instance = new Example1();
            c = instance.min(a,b);

            System.out.println("Min : " + c);

            // When passing primitive variables as parameters to
            // the method, their value is copied to formal parameters
            instance.modifyPrimitives(a);

            System.out.println("Main : " + a);


        }
    }
