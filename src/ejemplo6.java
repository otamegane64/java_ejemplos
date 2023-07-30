
    import java.io.*;
import java.util.*;

    public class ejemplo6 {

        static boolean bandera=true;
        static int h,b;
        static
        {
            Scanner leer = new Scanner(System.in);
            b = leer.nextInt();
            leer.nextLine();
            h = leer.nextInt();
            leer.close();
            if(h<=0 || b<=0)
            {
                bandera = false;
                System.out.print("java.lang.Exception: Breadth and height must be positive");
            }else if(h>0 && b>0)
                bandera=true;
        }
        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

            if(bandera)
            {
                int area= b*h;
                System.out.println(area);
            }

        }
    }

