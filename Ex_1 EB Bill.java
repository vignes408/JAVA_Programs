import java.io.*;
import java.util.*;
public class bill
{
public static void main(String args[]){
double bill;
double x,y,z,a;
Scanner c = new Scanner(System.in);
System.out.println("Enter your choice:\n 1.Domestic \n 2.Commercial");
int ch = c.nextInt();
System.out.println("Enter previous rate:");
double g = c.nextDouble ();
System.out.println("Enter current rate:");
double h = c.nextDouble ();
z=h-g;
System.out.println("Total units consumed: "+z);
switch(ch){
case 1:
if(z<101)
{
a=(z*1);
System.out.println("Total cost: "+a);
}
else if(z<201)
{
a=(z-100)*(2.5)+100;
System.out.println("Total cost: "+a);
}
else if(z<=501)
{
a=((z-200)*(4))+100+250;
System.out.println("Total cost: "+a);
}
else
{
a=(z-500)*(6)+100+250+400;
System.out.println("Total cost: "+a);
}
break;
case 2:
if(z<101)
{
a=(z*2);
System.out.println("Total cost: "+a);
}
else if(z<201)
{
a=(z-100)*(4.5)+200;
System.out.println("Total cost: "+a);
}
else if(z<=501)
{
a=(z-200)*(6)+200+450;
System.out.println("Total cost: "+a);
}
else
{
a=(z-500)*(7)+200+450+600;
System.out.println("Total cost: "+a);
}

break;

}

}

}
