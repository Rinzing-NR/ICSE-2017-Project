import java.io.*;

class Q30Kidomaru
{
public static void main (String args[]) throws IOException
    {
        int n,r,sum=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number you want to check is palindrome or not");
        n=Integer.parseInt(br.readLine());
        int copy=n;
        while(n>0)
        {
         r=n%10;
         sum=sum*10+r;
         n=n/10;
        }
        if(sum==copy)
            {
             System.out.print("It is a palindrome number");
            }
        else
            {
             System.out.print("It is not a palindrome number");
            }  
    }    
}
