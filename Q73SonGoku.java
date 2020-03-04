import java.io.*;

class  Q73SonGoku
{
    public static void main (String args[])throws IOException
    {
        int n,sum=0,r,r2,pro=1;
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter the value you want to check");
        n=Integer.parseInt(br.readLine());
        int copy=n,copy2=n;
        while(n>0)
        {
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        while(copy2>0)
        {
            r2=copy2%10;
            pro=pro*r2;
            copy2=copy2/10;
        }
        if(sum+pro==copy)
        {
            System.out.print("It is a special number");
        }
        else
        {
            System.out.print("It is not a special number");
        }
    }
}