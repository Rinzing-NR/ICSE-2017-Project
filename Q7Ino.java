import java.io.*;

class Q7Ino
{
    public static void main (String args[])throws IOException
    {
        int a,b,c;
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter first side");
        a=Integer.parseInt(br.readLine());
        System.out.println("Enter second side");
        b=Integer.parseInt(br.readLine());
        System.out.println("Enter third side");
        c=Integer.parseInt(br.readLine());
        int d=a+b;
        if(c==d)
        {
            System.out.print("It is a complementary triangle");
        }
        else
        {
            System.out.print("It is not a complementary triangle");
        }         
    }
}