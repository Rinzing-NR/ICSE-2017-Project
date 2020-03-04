import java.io.*;

class Q75Saiken
{
    public static void main (String args [])throws IOException
    {
        String s1,s2,s3,s4;
        char ch1,ch2;
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        BufferedReader br2=new BufferedReader (new InputStreamReader(System.in));
        BufferedReader br3=new BufferedReader (new InputStreamReader(System.in));
        BufferedReader br4=new BufferedReader (new InputStreamReader(System.in));
        BufferedReader br5=new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter the string");
        s1=br.readLine();
        System.out.println("Enter the character you want to replace");
        ch1=(char)br.read();
        System.out.println("Enter the character you want to replace with");
        ch2=(char)br2.read();
        System.out.println("Enter the sentence whose first and last index position you want");
        s2=br3.readLine();
        System.out.println("Enter the first string you want to add");
        s3=br4.readLine();
        System.out.println("Enter the second string you want to add");
        s4=br5.readLine();
        Q75Saiken obj=new Q75Saiken();
        obj.Joystring(s1,ch1,ch2);
        obj.Joystring(s2);
        obj.Joystring(s3,s4);
    }
    void Joystring(String a,char x,char y)
    {
        String b=a.replace(x,y);
        System.out.println(b);
    }
    void Joystring(String r)
    {
         int l=r.length();
         int i=r.indexOf(' ');
         int j=r.lastIndexOf(' ');
         System.out.println("First index="+i);    
         System.out.println("last index="+j);
    }
    void Joystring(String e,String f)
    {
        String t=e.concat(f);
        System.out.println(t);
    }
}