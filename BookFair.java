import java.io.*;

class BookFair
    {
        String Bname;
        double price,d;        
        public static void main(String args[])throws IOException
        {
            BookFair obj=new BookFair();
            obj.input();
            obj.calculate();
            obj.display();
        }
        void input()throws IOException
        {
             BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
             System.out.println("Enter your books name:");
             Bname=br.readLine();
             System.out.println("Enter your books price:");
             price=Double.parseDouble(br.readLine());
            }
        void calculate()
        {
            if(price<=1000)
            {
            d=price-0.02*price;
            }
            else if(price>1000 && price<=3000)
            {
                d=price-0.10*price;
            }
            else
            {
                d=price-0.15*price;
            }
        }
        void display()
        {
            System.out.println("Books name="+Bname);
            System.out.print("Price after discount="+d);
        }
    }

