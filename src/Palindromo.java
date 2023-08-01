import java.io.*;
import java.util.*;
public class Palindromo {
       //Saber si una palabra es palindroma
        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            String A=sc.next();
            String invertida = new StringBuilder(A).reverse().toString();

            /* Enter your code here. Print output to STDOUT. */
            if(A.equals(invertida))
            {
                System.out.print("Yes");
            }else
                System.out.print("No");
        }

}
