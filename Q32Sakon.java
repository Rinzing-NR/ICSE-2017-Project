import java.io.*;

class Q32Sakon
{
public static void main (String args[]) throws IOException
    {
        int n,i;
        long fact=1;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number whose factoral value you want to obtain");
        n=Integer.parseInt(br.readLine());
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.print("Factoral value="+fact);  
    }    
}
