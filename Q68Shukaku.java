import java.io.*;

class Q68Shukaku
{
public static void main (String args[]) throws IOException
    {
        int i,n;
        String str,reverse="";
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the string you want to check");
        str=br.readLine();
        n=str.length();
        int l=str.length();
        for(i=l-1;i>=0;i--)
        {
         char ch=str.charAt(i);  
         reverse=reverse+ch;
        }
        char ch1=str.charAt(0);
        char ch2=str.charAt(l-1);
        if(str.equals(reverse))
            {
             System.out.print("It is a palindrome string");
            }
        else if(ch2==ch1)
            {
             System.out.print("It is a special word");
            }
        else
            {        
              System.out.print("It is neither of the two");
            }
        }
    }

    
        
    
