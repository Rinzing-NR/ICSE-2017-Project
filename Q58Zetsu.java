import java.io.*;

class Q58Zetsu
{
public static void main (String args[]) throws IOException
    {
        int i,count=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
        System.out.println("Enter a string");
        String txt=br.readLine();
        int len=txt.length();
        for(i=0;i<len;i++)
         {
             char ch=txt.charAt(i);   
             if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
               {
                 count++;
               }
            }
        System.out.println("Number of vowels="+count);
    }
}

       
            
         
    

       