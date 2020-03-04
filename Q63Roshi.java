import java.io.*;

class Q63Roshi
{
    public static void main (String args[])throws IOException
    {
        double cp,sp,pro;
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter the cost price");
        cp=Double.parseDouble(br.readLine());
        System.out.println("Enter the selling price");
        sp=Double.parseDouble(br.readLine());
        pro=sp-cp;
        System.out.println("Net profit="+pro);
    }
}