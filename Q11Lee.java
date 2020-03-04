import java.io.*;

class Q11Lee
{
    public static void main (String args[])throws IOException
    {
        int prep,n;
        double po;
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter the present population");
        prep=Integer.parseInt(br.readLine());
        System.out.println("Enter the years");
        n=Integer.parseInt(br.readLine());
        po=prep*(Math.pow(1.06,n));
        System.out.println("Population after the years entered="+po);
    }
}