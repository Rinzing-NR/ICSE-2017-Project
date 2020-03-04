import java.io.*;

class Q17Zabuza
{
public static void main (String args[]) throws IOException
    {
        int choice;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 1 for KB to BYTE,2 for METER toINCH and 3 for GALLON to LITER");
        choice=Integer.parseInt(br.readLine());
        double a,b;
        switch(choice)
        {
        case 1:
            System.out.println("Enter the value in KB");
            a=Double.parseDouble(br.readLine());
            b=a*1024;
            System.out.println("Value in Byte="+b+"Byte");
            break;
        case 2:
            System.out.println("Enter the value in meter");
            a=Double.parseDouble(br.readLine());
            b=a*39.34;
            System.out.println("Value in inch="+b+"Inch");
            break;
         case 3:
            System.out.println("Enter the value in gallon");
            a=Double.parseDouble(br.readLine());
            b=a*20/9;
            System.out.println("Value in liter"+b+"Liter");
            break;
         default:
            System.out.print("Invalid input");
        }
    }
}
