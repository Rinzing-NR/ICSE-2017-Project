import java.io.*;

class Q22Orochimaru
{
public static void main (String args[]) throws IOException
    {
        int n,i;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the last value till where you want the output");
        n=Integer.parseInt(br.readLine());
        for(i=1;i<=n;i++)
        {
         if(i%2!=0)
            {
             System.out.print(i+" ");
            }
        }
    }
}
