import java.io.*;

class Q18Haku
{
    public static void main (String args[])throws IOException
    {
        double sale,com;
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter the sale");
        sale=Double.parseDouble(br.readLine());
        if(sale<5000)
        {
          com=sale*5/100;
        }
        else if(sale>5000&&sale<=10000)
        {  
          com=sale*10/100;
        }
        else if(sale>10000&&sale<=20000)
        {  
          com=sale*20/100;
        }
        else
        {  
          com=sale*30/100 ;
        }
        System.out.print("Commision="+com);
    }
}

 

        