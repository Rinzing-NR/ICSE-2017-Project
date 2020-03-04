import java.io.*;

class Q14Kiba
{
public static void main (String args[]) throws IOException
    {
        int choice;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 1 for addition,2 for subtraction,3 for multiplication and 4 for division");
        choice=Integer.parseInt(br.readLine());
        double a,b,c;
        switch(choice)
        {
        case 1:
            System.out.println("Enter the first value");
            a=Double.parseDouble(br.readLine());
            System.out.println("Enter the second value");
            b=Double.parseDouble(br.readLine());
            c=a+b;
            System.out.print("Sum="+c);
            break;
        case 2:
            System.out.println("Enter the first value");
            a=Double.parseDouble(br.readLine());
            System.out.println("Enter the second value");
            b=Double.parseDouble(br.readLine());
            c=a-b;
            System.out.print("Difference="+c);
            break;
         case 3:
            System.out.println("Enter the first value");
            a=Double.parseDouble(br.readLine());
            System.out.println("Enter the second value");
            b=Double.parseDouble(br.readLine());
            c=a*b;
            System.out.print("Product="+c);
            break;
         case 4:
            System.out.println("Enter the first value");
            a=Double.parseDouble(br.readLine());
            System.out.println("Enter the second value");
            b=Double.parseDouble(br.readLine());
            c=a/b;
            System.out.println("Quotient="+c);
            double d=a%b;
            System.out.print("Remainder="+d);
            break;
         default:
            System.out.print("Invalid input");
        }
    }
}
