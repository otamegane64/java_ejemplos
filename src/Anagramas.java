import java.util.Scanner;

public class Anagramas {

    static boolean isAnagram(String a, String b) {
        a=a.toLowerCase();
        b=b.toLowerCase();

        java.util.List<String> listaA = new java.util.ArrayList<>();
        java.util.List<String> listaB = new java.util.ArrayList<>();
        for(int i=0;i<a.length();i++)
        {
            listaA.add(a.substring(i,i+1));
        }
        for(int i=0;i<a.length();i++)
        {
            listaB.add(b.substring(i,i+1));
        }
        if(listaA.size()==listaB.size())
        {
            for(int i=0;i<listaA.size();i++)
            {
                for(int j=0;j<i+1;j++)
                {


//System.out.println(listaA.get(i)+" se compara con "+listaB.get(j));
                    if(listaA.get(i).equals(listaB.get(j)))
                    {
                        //System.out.println("se elimina: "+listaB.get(j));
                        listaB.remove(j);

                        break;
                    }else break;

                }
            }
            System.out.println(listaB);
            if(listaB.isEmpty())
            {
                return true;
            }else return false;

        }else
            return false;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
    //OTRA SOLUCION
    // /*        a=a.toLowerCase();
    //        b=b.toLowerCase();
    //          if(a.length()==b.length())
    //
    //        {
    //            int[] arregloA = new int[256];
    //            int[] arregloB = new int[256];
    //            for (int i = 0; i < a.length(); i++) {
    //                arregloA[(int) a.charAt(i)] += 1;
    //                arregloB[(int) b.charAt(i)] += 1;
    //            }
    //            for (int i = 0; i < 256; i++) {
    //                if (arregloA[i] != arregloB[i])
    //                    return false;
    //
    //            }
    //            return true;
    //        }
    //        else
    //        {
    //            return false;
    //        }
    // */
}
