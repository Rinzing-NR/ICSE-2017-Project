import java.io.*;

class Q64Han
{
    public static void main (String args[])throws IOException
    {
        int a,b,temp;
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter the first number");
        a=Integer.parseInt(br.readLine());
        System.out.println("Enter the second number");
        b=Integer.parseInt(br.readLine());
        temp=a;
        a=b;
        b=temp;
        System.out.println("A="+a);
        System.out.println("B="+b);
    }
}