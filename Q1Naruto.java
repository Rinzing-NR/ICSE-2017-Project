import java.io.*;

class Q1Naruto
{
    public static void main (String args[])throws IOException
    {
        double c,f;
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter the value of centigrade you want to convert");
        c=Double.parseDouble(br.readLine());
        f=32+c*9/5;
        System.out.print("Farenheit value="+f);
    }
}