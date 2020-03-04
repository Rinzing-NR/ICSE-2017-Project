import java.io.*;

class Q27Itachi
{
public static void main (String args[]) throws IOException
    {
        int n,i,sum=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number you want to check");
        n=Integer.parseInt(br.readLine());
        for(i=1;i<n;i++)
        {
         if(i%n==0)
            {
             sum=sum+i;
            }
        }
        if(sum==n)
            {
             System.out.print("It is a perfect number");
            }
        else
            {
             System.out.print("It is not a perfect number");
            }
    }
}