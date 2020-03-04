import java.io.*;

class Q13Kurenai
{
    public static void main (String args[])throws IOException
    {
        double sale,com;
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter the sale");
        sale=Double.parseDouble(br.readLine());
        if(sale>100000)
        {
           com=25/100*sale;
        }
        else if(sale>=80000&&sale<100000)
        {  
           com=22.5/100*sale;
        }
        else if(sale>=80000&&sale<60000)
        {  
           com=20/100*sale;
        }
        else if(sale>=60000&&sale<40000)
        {  
           com=15/100*sale;
        }
        else
        {  
           com=12.5/100*sale;
        }
        System.out.print("Commision="+com);
    }
}
 

        