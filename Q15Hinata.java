import java.io.*;

class Q15Hinata
{
    public static void main (String args[])throws IOException
    {
        double unit,bill,charge;
        int mc=50;
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter the units consumed");
        unit=Double.parseDouble(br.readLine());
        if(unit>200)
        {
           charge=(100*0.80)+(100*1)*(unit-200)*1.25;
        }
        else if(unit>=100&&unit<200)
        {  
           charge=(100*0.80)+(unit-100)*1;
        }
        else
        {  
           charge=0.80*unit;
        }
        bill=mc+charge;
        System.out.print("Monthly bill="+bill);
    }
}
 

        