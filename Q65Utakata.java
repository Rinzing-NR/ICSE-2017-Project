import java.io.*;

class Q65Utakata
{
    public static void main (String args[])throws IOException
    {
        int i,r,n;
        double sum=0;
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter the decimal number");
        n=Integer.parseInt(br.readLine());
        for(i=0;i<=n;i++)
        {
         r=n%2;
         sum=sum+r*Math.pow(10,i);
         n=n/2;
        }
        System.out.println("Binary number="+sum);
    }
}
        