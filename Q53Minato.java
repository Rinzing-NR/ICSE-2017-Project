import java.io.*;

class Q53Minato
{
public static void main (String args[]) throws IOException
    {
        int arr[]=new int[10];
        int i,j,sum=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
        System.out.println("Enter 10 numbers of which you want the sum");
        for(i=0;i<10;i++)
         {
         arr[i]=Integer.parseInt(br.readLine());
         }
         for(j=0;j<10;j++)
         {
             sum=sum+arr[j];
         }
         System.out.print("Sum="+sum);
    }
}
            
         
    

        