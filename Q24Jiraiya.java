import java.io.*;

class Q24Jiraiya
{
public static void main (String args[]) throws IOException
    {
        int n,i,sum=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the last value till where you want the output");
        n=Integer.parseInt(br.readLine());
        for(i=1;i<=n;i++)
        {
         if(i%2==0)
            {
             sum=sum+i;
            }
        }
        System.out.print("Sum of even numbers entered="+sum);
    }
}
