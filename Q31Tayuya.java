import java.io.*;

class Q31Tayuya
{
public static void main (String args[]) throws IOException
    {
        int n,r;
        double sum=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number you want to check is armstrong or not");
        n=Integer.parseInt(br.readLine());
        int copy=n;
        while(n>0)
        {
         r=n%10;
         sum=sum+Math.pow(r,3);
         n=n/10;
        }
        if(sum==copy)
            {
             System.out.print("It is an armstrong number");
            }
        else
            {
             System.out.print("It is not an armstrong number");
            }  
    }    
}
