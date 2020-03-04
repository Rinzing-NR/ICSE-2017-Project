import java.io.*;

class Q56Ohnoki
{
public static void main (String args[]) throws IOException
    {
        int arr[]=new int[10];
        int i,j,temp;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
        System.out.println("Enter 10 numbers");
        for(i=0;i<10;i++)
         {
            arr[i]=Integer.parseInt(br.readLine()); 
         }         
        for(i=0;i<9;i++)
         {
            for(j=i+1;j<10;j++)
            {
                if(arr[i]>arr[j])
               {
                  temp=arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;
               }
            }
         }
        System.out.println("Elements in ascending order:");
        for(i=0;i<10;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
        
    

            
         
    

        