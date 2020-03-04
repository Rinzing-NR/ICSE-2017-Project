import java.io.*;

class Q10Neji
{
    public static void main (String args[])throws IOException
    {
        int a;
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter your number");
        a=Integer.parseInt(br.readLine());
        if(a%7==0&&a%10==7)
        {
            System.out.print("It is a buzz number");
        }
        else
        {
            System.out.print("It is not a buzz number");
        }
    }
}
    