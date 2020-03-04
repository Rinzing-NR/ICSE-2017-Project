import java.io.*;

class Q19Gaara
{
    public static void main (String args[])throws IOException
    {
        int rc=180,call;
        double bill;
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter the number of calls");
        call=Integer.parseInt(br.readLine());
        if(call<=50)
        {
           bill=rc;
        }
        else if(call>50&&call<=150)
        {  
           bill=(call-50)*1+rc;
        }
        else if(call>150&&call<=350)
        {  
           bill=(call-150)*0.90+100*1+rc;
        }
        else
        {  
           bill=(call-350)*0.80+150*0.90+100*1+rc;
        }
        System.out.println("No.of calls\tMonthly rental\tTotal amount to be paid");
        System.out.print(call+"\t"+"\t"+rc+"\t"+"\t"+bill);
    }
}

        