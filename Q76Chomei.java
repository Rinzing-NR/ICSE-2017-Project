import java.io.*;

class Q76Chomei
{
public static void main (String args[]) throws IOException
    {
        int choice;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 1 to check weather the number is composite or not");
        System.out.println("Enter 2 to find the smallest digit in an input");
        System.out.println("Enter your choice");
        choice=Integer.parseInt(br.readLine());
        switch(choice)
        {
        case 1:
           int i=0,a,count=0;
           System.out.println("Enter the number you want to check");
           a=Integer.parseInt(br.readLine());
           for(i=1;i<=a;i++)
           {
              if(a%i==0)
                {
                  count++;
                }
           }
           if(count!=2)
               {
                 System.out.print("It is a composite number");
               }
           else
               {
                 System.out.print("It is not a composite number");
               }
           break;
        case 2: 
           int n,small=9,r;
           System.out.println("Enter the number you want to check");
           n=Integer.parseInt(br.readLine());
           while(n>0)
           {
               r=n%10;
               small=Math.min(small,r);
               n=n/10;
           }
           System.out.print("Smallest digit="+small);
           break;
         default:
            System.out.print("Invalid input");
        }
    }
}
