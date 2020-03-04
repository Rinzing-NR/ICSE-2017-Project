import java.io.*;

class Q37Yamato
{
public static void main (String args[]) throws IOException
    {
        int a,b,i,hcf=0,lcm;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the first number");
        a=Integer.parseInt(br.readLine());
        System.out.println("Enter the second number");
        b=Integer.parseInt(br.readLine());
        for(i=1;i<=a&&i<=b;i++)
        {
         if(a%i==0&&b%i==0)
         {
            hcf=i;
         }
        }
        lcm=(a*b)/hcf;
        System.out.println("LCM="+lcm);
        System.out.print("HCF="+hcf);
    }
}