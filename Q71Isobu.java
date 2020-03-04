import java.io.*;

class Q71Isobu
{
    public static void main(String args[])throws IOException
    {
        String s,pth,fname,file,ext;
        int i,j;
        s="C:\\Users\\admin\\Pictures\\flower.jpg";
        i=s.lastIndexOf('\\');
        pth=s.substring(0,i+1);
        fname=s.substring(i+1);
        j=fname.indexOf('.');
        file=fname.substring(0,j);
        ext=fname.substring(j+1);
        System.out.println("Path:"+pth);
        System.out.println("File name:"+file);
        System.out.println("Extention:"+ext);
    }
}
