import java.io.*;

class Q43Kotetsu
{
public static void main (String args[]) throws IOException
    {
        int i,j;
         for(i=1;i<=5;i++)
         {
         for(j=5;j>=i;j--)
            { 
             System.out.print("X ");
            }
             System.out.println(" ");
         }
    }
}