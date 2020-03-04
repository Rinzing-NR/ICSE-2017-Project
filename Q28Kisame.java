import java.io.*;

class Q28Kisame
{
public static void main (String args[]) throws IOException
    {
        int n,r,sum=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number whose digits you want to add");
        n=Integer.parseInt(br.readLine());
        while(n>0)
        {
         r=n%10;
         sum=sum+r;
         n=n/10;
        }
        System.out.print("Sum of digits="+sum);  
    }    
}
