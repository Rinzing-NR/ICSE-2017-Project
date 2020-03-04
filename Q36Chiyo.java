import java.io.*;

class Q36Chiyo
{
public static void main (String args[]) throws IOException
    {
        int n,i,a=0,b=1,sum=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number till where you want the fibbonacci series less than the input and as an even number");
        n=Integer.parseInt(br.readLine());
        while(sum<n)
          {
            if(sum%2==0)
             {   
                  System.out.print(sum+" ");
             }
            sum=a+b;
            b=a;
            a=sum;
          }
    }
}
     
