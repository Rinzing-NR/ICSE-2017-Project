import java.io.*;

class Q39Yugito
{
public static void main (String args[]) throws IOException
    {
        int a,b,i;
        double sum=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the numerator");
        a=Integer.parseInt(br.readLine());
        System.out.println("Enter the number till where you want the output");
        b=Integer.parseInt(br.readLine());  
        for(i=1;i<=b;i++)
        {
         sum=sum+(a/i);
        }
        System.out.print("Sum="+sum);
    }
}