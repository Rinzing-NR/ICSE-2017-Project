import java.io.*;

class  Q67Kushina
{
    public static void main (String args[])throws IOException
    {
        int n,sum=0,r,i;
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter the value you want to check");
        n=Integer.parseInt(br.readLine());
        int copy=n;
        while(n>0)
        {
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        if(copy%sum==0)
        {
            System.out.print("It is a niven number");
        }
        else
        {
            System.out.print("It is not a niven number");
        }
    }
}