
import java.util.Scanner;

public class Ejercicio11 {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        java.util.List<String> a = new java.util.ArrayList<>();
        for(int i=0;i<s.length()-k+1;i++)
        {
            a.add(s.substring(i,i+k));
        }
        java.util.Collections.sort(a);
        smallest = a.get(0);
        largest = a.get(a.size()-1);
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}