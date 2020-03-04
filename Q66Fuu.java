import java.io.*;

class Q66Fuu
{
    public static void main (String args[])throws IOException
    {
        int i,r,n;
        double sum=0;
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter the binary number");
        n=Integer.parseInt(br.readLine());
        for(i=0;i<=n;i++)
        {
         r=n%10;
         sum=sum+r*Math.pow(2,i);
         n=n/10;
        }
        System.out.println("Decimal number="+sum);
    }
}
        