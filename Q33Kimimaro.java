import java.io.*;

class Q33Kimimaro
{
public static void main (String args[]) throws IOException
    {
        int n,i;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number whose table you want");
        n=Integer.parseInt(br.readLine());
        for(i=1;i<=10;i++)
        {
         System.out.println(n+"x"+i+"="+(n*i));
        }
    }    
}
