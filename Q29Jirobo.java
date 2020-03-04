import java.io.*;

class Q29Jirobo
{
public static void main (String args[]) throws IOException
    {
        int n,r,sum=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number whose digits you want to reverse");
        n=Integer.parseInt(br.readLine());
        while(n>0)
        {
         r=n%10;
         sum=sum*10+r;
         n=n/10;
        }
        System.out.print("Reverse of number="+sum);  
    }    
}
