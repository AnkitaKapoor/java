/*
ystem.out.println(i + " " + i * i );

 *
 * Author:        Your Name
 * Creation Date: Saturday, April 11 2015, 22:57 
 * Last Modified: Thursday, June 18 2015, 00:19
 * 
 * Class Description:
 *
 */
import java.util.*;
public class LandYourShip
{
public static void main(String[] args)
{
int x= (int)(Math.random()*20)-10;
int y=(int)(Math.random()*5)+5;
System.out.printf("The starting position of the spaceship is x = %d y = %1d \n", x, y);
int i=10;
do
{
   if (i!=10)
   {
      System.out.printf("You are now at coordinates x = %d  y = %1d\n", x, y); 
      System.out.println();
      System.out.printf("You have %d attempts remaining \n", i);
   }
System.out.println("Space ship landing control \n  Full up \n  Half up \n  Down \n  Left \n  Right \n  Maintain \n  Eject");
Scanner inp3= new Scanner(System.in);
System.out.print("Enter choice >>");
String str= inp3.nextLine();
str= str.toLowerCase();
//=======
switch(str)
{
case "full up":
y=y+2;
break;
case "half up":
y=y+1;
break;
case "down":
y=y-1;
break;
case "left":
x=x-1;
break;
case "right":
x=x+1;
break;
case "maintain":
break;
case "eject":
i=0;
System.out.println("You have exit the program.");
break;
default:
i=0;
System.out.println("Invalid Choice.");
break;  
}
i=i-1;
y=y-1;
 if (x==0 && y==0)
 {
    System.out.println("You are now at coordinates x = 0  y = 0 \n Well done pilot, you have the right stuff !!");
    i=0;
    }

    if (((x>=10) || (x<=-10) || (y<0)) && (!(i==0)))
    {
       System.out.println("Your spaceship has crashed.It has reached out of  boundary.");
      i=0;
       }
}
while(i>0);


if ((!(x==0 && y==0)) && i==0)
{
   System.out.println("Your space ship has run out of fuel. Space ship has crashed.. ");
   }
}
}

