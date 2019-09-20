
import java.util.Scanner;

class GetInputFromUser
{
   public static void main(String args[])
   {
        int day,month,year;
        int i,j,k,a,b,c,d;
/*      Scanner in = new Scanner(System.in);

        System.out.println("Enter Day");
        day = in.nextInt();
        System.out.println("Enter month");
        month = in.nextInt();
        System.out.println("Enter year");
        year = in.nextInt();
*/

Scanner sc = new Scanner(System.in);
int[] integers = new int[3];
for(int i = 0; i < 3; i++)
{
    integers[i] = sc.nextInt();
}
        i=(year%100)/4;
        if(year%4!=0)
        switch(month)
        {


                case 01: j=1;
                        break;
                case 02: j=4;
                        break;
                case 03: j=4;
                        break;
                case 04: j=0;
                        break;
                case 05: j=2;
                        break;
                case 06: j=5;
                        break;
                case 07: j=0;
                        break;
                case 8: j=3;
                        break;
                case 9: j=6;
                        break;
                case 10: j=1;
                        break;
                case 11: j=4;
                        break;
                case 12: j=6;
                        break;
        }

        else
        switch(month)
         {
                case 01: j=0;
                        break;
                case 02: j=3;
                        break;
                case 03: j=4;
                        break;
                case 04: j=0;
                        break;
                case 05: j=2;
                        break;
                case 06: j=5;
                        break;
                case 07: j=0;
                        break;
                case 8: j=3;
                        break;
                case 9: j=6;
                        break;
                case 10: j=1;
                        break;
                case 11: j=4;
                        break;
                case 12: j=6;
                        break;
        }

                d=year/100;
                if(d%4==1)
                k=4;
                if(d%4==2)
                k=2;
                if(d%4==3)
                k=0;
                if(d%4==0)
                k=6;

                c=year%100;
                a=i+day+j+k+c;
                b=a%7;


        switch(b)
        {

                case 0: System.out.println(" saturday");
                        break;

                case 1: System.out.println(" sunday");
                        break;

                case 2: System.out.println(" monday");
                        break;

                case 3: System.out.println(" tuesday");
                        break;


                case 4: System.out.println(" wednesday");
                        break;

                case 5: System.out.println(" thusday");
                        break;

                case 6: System.out.println(" friday");
                        break;
        }
}












