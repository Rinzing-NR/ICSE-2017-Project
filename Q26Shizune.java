import java.io.*;

class Q26Shizune
{
public static void main (String args[]) throws IOException
    {
        int n,i,count=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number you want to check");
        n=Integer.parseInt(br.readLine());
        for(i=1;i<=n;i++)
        {
         if(n%i==0)
            {
             count++;
            }
        }
        if(count==2)
            {
             System.out.print("It is a prime number");
            }
        else
            {
             System.out.print("It is not a prime number");
            }
    }
}