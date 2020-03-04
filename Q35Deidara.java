import java.io.*;

class Q35Deidara
{
public static void main (String args[]) throws IOException
    {
        int n,i,a=0,b=1,sum=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number till where you want the fibbonacci series less than input");
        n=Integer.parseInt(br.readLine());
        while(sum<n)
        {
            System.out.print(sum+" ");
            sum=a+b;
            b=a;
            a=sum;
        }
    }
}