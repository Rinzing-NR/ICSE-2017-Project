import java.io.*;

class Q38Sai
{
public static void main (String args[]) throws IOException
    {
        int n,i;
        double sum=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number till where you want the output");
        n=Integer.parseInt(br.readLine());       
        for(i=1;i<=n;i++)
        {
             sum=1/i+sum;
        }
        System.out.print("Sum="+sum);
    }
}