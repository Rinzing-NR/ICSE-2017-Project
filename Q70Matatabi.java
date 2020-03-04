import java.io.*;

class Q70Matatabi
{
public static void main (String args[]) throws IOException
    {
        int choice;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 1 for First 10 terms of fibbonacci series");
        System.out.println("Enter 2 to find the sum of digts of a number");
        System.out.println("Enter your choice");
        choice=Integer.parseInt(br.readLine());
        switch(choice)
        {
        case 1:
            int i=0,sum=0,a=0,b=1;
            for(i=1;i<=10;i++)
            {
                System.out.print(sum+" ");
                sum=a+b;
                b=a;
                a=sum;
             }
            break;
        case 2: 
           int n,r,s=0;
           System.out.println("Enter the number whose digits you want to add");
           n=Integer.parseInt(br.readLine());
           while(n>0)
           {
               r=n%10;
               s=s+r;
               n=n/10;
           }
           System.out.print("Sum of digits="+s);
           break;
         default:
            System.out.print("Invalid input");
        }
    }
}
