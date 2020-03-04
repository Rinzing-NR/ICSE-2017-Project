import java.io.*;

class Q6Shikamaru
{
    public static void main (String args[])throws IOException
    {
        int a;
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter your age");
        a=Integer.parseInt(br.readLine());
        if(a>=18)
        {
            System.out.print("You are eligible to vote");
        }
        else
        {
            System.out.print("You are not allowed eligible to vote");
        } 
        
    }
}