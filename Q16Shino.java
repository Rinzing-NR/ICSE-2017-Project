import java.io.*;

class Q16Shino
{
    public static void main (String args[])throws IOException
    {
        double sal,tax;
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter your annual salary");
        sal=Double.parseDouble(br.readLine());
        if(sal<50000)
        {
           tax=0;
        }
        else if(sal>50000&&sal<=60000)
        {  
           tax=(sal-50000)*10/100;
        }
        else if(sal>60000&&sal<=150000)
        {  
           tax=1000+(sal-60000)*20/100;
        }
        else
        {  
           tax=19000+(sal-150000)*30/100;
        }
        System.out.print("Tax="+tax);
    }
}
 

        