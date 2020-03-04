import java.io.*;

class Q12Tenten
{
    public static void main (String args[])throws IOException
    {
        double eng,mat,sci,sst,elec,tot,per;
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter the marks obtained in english");
        eng=Double.parseDouble(br.readLine());
        System.out.println("Enter the marks obtained in maths");
        mat=Double.parseDouble(br.readLine());
        System.out.println("Enter the marks obtained in science");
        sci=Double.parseDouble(br.readLine());
        System.out.println("Enter the marks obtained in social studies");
        sst=Double.parseDouble(br.readLine());
        System.out.println("Enter the marks obtained in elective");
        elec=Double.parseDouble(br.readLine());
        tot=eng+mat+sci+sst+elec;
        per=tot/5;
        System.out.println("Percentage of student="+per);
        if(per<40)
        {
           System.out.print("Grade=Fail");
        }
        else if(per>=40&&per<60)
        {  
           System.out.print("Grade=2nd Division");
        }
        else if(per>=60&&per<75)
        {  
           System.out.print("Grade=1st Division");
        }
        else
        {  
           System.out.print("Grade=Passed with star");
        }
    }
}
        