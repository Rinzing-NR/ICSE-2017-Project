import java.io.*;

class Q60Obito
{
public static void main (String args[]) throws IOException
    {
        int i;
        String str,reverse="";
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string");
        str=br.readLine();
        int l=str.length();
        for(i=l-1;i>=0;i--)
        {
         char ch=str.charAt(i);  
         reverse=reverse+ch;
        }
        if(str.equals(reverse))
            {
             System.out.print("It is a palindrome string");
            }
        else
            {
             System.out.print("It is not a palindrome string");
            }  
    }    
}
