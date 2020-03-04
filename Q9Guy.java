import java.io.*;

class Q9Guy
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
        System.out.println("Total marks obtained="+tot);
        per=tot/5;
        System.out.print("Percentage of student="+per);
    }
}