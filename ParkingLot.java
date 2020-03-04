import java.io.*;

class ParkingLot
{
    int vno,hours;
    double bill;
        public static void main(String args[])throws IOException
    {
        ParkingLot ob=new ParkingLot();
        ob.input();
        ob.calculate();
        ob.display();
    }
    void input()throws IOException
        {
             BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
             System.out.println("Enter your vehicle no.:");
             vno=Integer.parseInt(br.readLine());
             System.out.println("Enter your hours:");
             hours=Integer.parseInt(br.readLine());
        }
    void calculate()
        {
            if(hours==1)
            {
                bill=3;
            }
            
            else
            {
                bill=3+1.5*(hours-1);
            }
        }
    void display()
        {
            System.out.println("Vehicle no="+vno);
            System.out.println("Hours="+hours);
            System.out.println("Bill="+bill);
        }
    }

