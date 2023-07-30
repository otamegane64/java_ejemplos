public class ejemplo4 {
   /*& Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();

        for(int i=0;i<t;i++)
    {

        try
        {
            long x=sc.nextLong();
            System.out.println(x+" can be fitted in:");
            if(x>=-128 && x<=127){
                System.out.println("* byte");
            }else if(x>=-32768 && x<=32767 )
            {
                System.out.println("* short");
                System.out.println("* int");
                System.out.println("* long");
            }else if(x>=(int)Math.pow(-2,31) &&
                    x<=(int)Math.pow(2,31))
            {
                System.out.println("* int");
                System.out.println("* long");
            }else
            {
                System.out.println("* long");
            }

            //Complete the code
        }
        catch(Exception e)
        {
            System.out.println(sc.next()+" can't be fitted anywhere.");
        }

    }*/
    //Ejercicio 4
   /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
   Scanner scan = new Scanner(System.in);
    int contador=0;
        while(scan.hasNext())
    {
        contador += 1;
        String texto = scan.nextLine();
        System.out.println(contador+ " "+texto);
    }
}
