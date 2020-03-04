import java.io.*;

class Q8Chouji
{
    public static void main (String args[])throws IOException
    {
        double a,b;
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter the number");
        a=Double.parseDouble(br.readLine());
        b=Math.abs(a);
        System.out.println("The absolute value of the number entered="+b);
    }
}