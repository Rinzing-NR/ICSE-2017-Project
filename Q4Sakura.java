import java.io.*;

class Q4Sakura
{
    public static void main (String args[])throws IOException
    {
        double a,m,f;
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter the force");
        f=Double.parseDouble(br.readLine());
        System.out.println("Enter the accelaration");
        a=Double.parseDouble(br.readLine());
        m=f/a;
        System.out.println("Mass="+m);
    }
}