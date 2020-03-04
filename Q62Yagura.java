import java.io.*;

class Q62Yagura
{
public static void main (String args[]) throws IOException
    {
        int i,count=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
        System.out.println("Enter the first string");
        String s1=br.readLine();
        System.out.println("Enter the second string");
        String s2=br.readLine();
        int len1=s1.length();
        int len2=s2.length();
        if(len1>len2)
        {
            System.out.print(s1);
        }
        else if(len2>len1)
        {
            System.out.print(s2);
        }
        else
        {
            System.out.print("Both are equal");
        }
    }
}
       
            
         
    

       