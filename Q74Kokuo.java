import java.io.*;

class Q74Kokuo
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
            for(j=0;j<9-i;j++)
            {
                if(arr[j]<arr[j+1])
               {
                  temp=arr[j];
                  arr[j]=arr[(j+1)];
                  arr[(j+1)]=temp;
               }
            }
         }
        System.out.println("Elements in descending order:");
        for(i=0;i<10;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
        
    

            
         
    

       