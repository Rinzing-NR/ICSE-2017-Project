import java.io.*;

class Q46Jugo
{
public static void main (String args[]) throws IOException
    {
        int i,j,k,space=0;
         for(i=5;i>=1;i--)
         {
         for(j=1;j<=space;j++)
            { 
             System.out.print(" ");
            }
         int sum=0;
         for(k=1;k<=i;k++)
            { 
             System.out.print(sum);
             sum=sum+3;
            }
         System.out.println(" ");
         space++;
        } 
    }
}