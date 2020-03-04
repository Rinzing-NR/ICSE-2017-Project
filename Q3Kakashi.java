import java.io.*;

class Q3Kakashi
{
    public static void main (String args[])throws IOException
    {
        double sal,da,hra,fa,pf,gross,net,anet;
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter the basic salary");
        sal=Double.parseDouble(br.readLine());
        da=(10/100)*sal;
        hra=(15/100)*sal;
        fa=(12.55/100)*sal;
        pf=(8.75/100)*sal;
        gross=da+hra+fa+sal;
        net=gross-pf;
        anet=net*12;
        System.out.println("Gross="+gross);
        System.out.println("Net="+net);
        System.out.print("Anet="+anet);
    }
}