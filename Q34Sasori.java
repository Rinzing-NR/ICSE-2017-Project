import java.io.*;

class Q34Sasori
{
public static void main (String args[]) throws IOException
    {
        int n,i,a=0,b=1,sum=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number till where you want the fibbonacci series");
        n=Integer.parseInt(br.readLine());
        for(i=1;i<=n;i++)
        {
             System.out.print(sum+" ");
             sum=a+b;
             b=a;
             a=sum;
        }
    }    
}
