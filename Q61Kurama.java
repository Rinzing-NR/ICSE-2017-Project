import java.io.*;

class Q61Kurama
{
public static void main (String args[]) throws IOException
    {
        int i;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
        System.out.println("Enter a string");
        String txt=br.readLine();
        String s1=" ",s2=" ";
        String str=txt.toUpperCase();
        int len=str.length();
        for(i=0;i<len;i++)
         {
             char ch=str.charAt(i);   
             if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
               {
                 break;
               }
           s1=s1+ch; 
          }
        s2=str.substring(i)+s1+"AY";
        System.out.println("Piglatin form="+s2);
    }
}

       
            
         
    

       