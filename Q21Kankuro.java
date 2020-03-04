import java.io.*;

class Q21Kankuro
{
public static void main (String args[]) throws IOException
    {
        int day;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your number to be converted to day");
        day=Integer.parseInt(br.readLine());
        switch(day)
        {
        case 1:
            System.out.print("Monday");
            break;
        case 2:
            System.out.print("Tuesday");
            break;
        case 3:
            System.out.print("wednesday");
            break;
        case 4:
            System.out.print("Thursday");
            break;
        case 5:   
            System.out.print("Friday");
            break;
        case 6:
            System.out.print("Saturday");
            break;
        case 7:
            System.out.print("Sunday");
            break;
        default:
            System.out.print("Invalid input");
        }
    }
}
