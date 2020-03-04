import java.io.*;

class Q55Ay
{
public static void main (String args[]) throws IOException
    {
        int arr[]=new int[10];
        int i,large,small;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
        System.out.println("Enter 10 numbers");
        for(i=0;i<10;i++)
         {
         arr[i]=Integer.parseInt(br.readLine());
         }         
         large=small=arr[0];
         for(i=0;i<10;i++)
         {
            if(arr[i]>large)
             {
                 large=arr[i];
             }
            if(arr[i]<small)
            {
                 small=arr[i];
            }
         }
         System.out.println("Largest number="+large);
         System.out.print("Smallest number="+small);
   }
}
         
        
        
    

            
         
    

        