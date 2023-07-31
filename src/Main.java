import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //Formatear caracteres
            System.out.format("%-15s",s1);
            //Formatear numeros
            System.out.format("%03d%n", x);
        }
        System.out.println("================================");
        //Convertir un entero a String
        //String s = String.valueOf(n);
        //Convertir un String a entero
        //int numEntero = Integer.parseInt(numCadena);
    }
}