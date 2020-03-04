import java.io.*;

class Q20Temari
{
    public static void main (String args[])throws IOException
    {
        int days;
        double fine;
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter the number of days");
        days=Integer.parseInt(br.readLine());
        if(days<=7)
        {
           fine=0.20*days;
        }
        else if(days>7&&days<=14)
        {  
           fine=(days-7)*0.30+(0.20*7);
        }
        else if(days>14&&days<=21)
        {  
           fine=(days-14)*0.40+(0.30*7)+(0.20*7);
        }
        else
        {  
           fine=(days-21)*0.50+(7*0.40)+(0.30*7)+(0.20*7);
        }
        System.out.print("Fine="+fine);
    }
}

        