import java.io.*;

class Q54Danzo
{
public static void main (String args[]) throws IOException
    {
        int arr[]=new int[10];
        int i,check=0,search;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
        System.out.println("Enter 10 numbers");
        for(i=0;i<10;i++)
         {
         arr[i]=Integer.parseInt(br.readLine());
         }
         System.out.println("Enter the number you want to search");
         search=Integer.parseInt(br.readLine());
         for(i=0;i<10;i++)
         {
             if(search==arr[i])
             {
                 check=1;
                 break;
             }
             break;
         }
            if(check==i)
            {
                System.out.print("Search number found");
            }
            else
            {
                System.out.print("Search number not found");
            }
        }
    }        