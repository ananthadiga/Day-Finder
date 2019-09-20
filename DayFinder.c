/* C CODE*/ 
#include<stdio.h>
int main()
{
        int day,month,year;
        int i,j,k,a,b,c,d;
        printf(" enter date with space inbetween ");
        scanf("%d%d%d",&day,&month,&year);
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

                case 0: printf(" saturday");
                        break;

                case 1: printf(" sunday");
                        break;

                case 2: printf(" monday");
                        break;

                case 3: printf(" tuesday");
                        break;


                case 4: printf(" wednesday");
                        break;

                case 5: printf(" thusday");
                        break;

                case 6: printf(" friday");
                        break;
        }
}


/* Input: DDMMYYYY output: Day of the month */






























