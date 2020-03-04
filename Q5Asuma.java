import java.io.*;

class Q5Asuma
{
    public static void main (String args[])throws IOException
    {
        double a,b;
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter the first number");
        a=Double.parseDouble(br.readLine());
        System.out.println("Enter the second numbere");
        b=Double.parseDouble(br.readLine());
        if(a>b)
        {
            System.out.print("The first number is larger");
        }
        else if(b>a)
        {
            System.out.print("The second number is larger");
        }
        else
        {
            System.out.print("They are equal");
        }
    }
}
    