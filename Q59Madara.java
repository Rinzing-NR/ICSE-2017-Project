import java.io.*;

class Q59Madara
{
public static void main (String args[]) throws IOException
    {
        int i,count=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
        System.out.println("Enter a string");
        String txt=br.readLine();
        int len=txt.length();
        txt=txt.toUpperCase();
        for(i=0;i<len;i++)
         {
             char ch=txt.charAt(i);   
             if(ch!='A'&&ch!='E'&&ch!='I'&&ch!='O'&&ch!='U')
               {
                 count++;
               }
         }
        System.out.println("Number of consonants="+count);
    }
}

       
            
         
    

       