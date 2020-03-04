import java.io.*;

class Q2Sasuke
{
    public static void main (String args[])throws IOException
    {
        double p,r,t,si;
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter the value of principal");
        p=Double.parseDouble(br.readLine());
        System.out.println("Enter the rate of interest");
        r=Double.parseDouble(br.readLine());
        System.out.println("Enter the time");
        t=Double.parseDouble(br.readLine());
        si=p*r*t/100;
        System.out.print("Simple Interest="+si);
    }
}