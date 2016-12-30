/*
 * Class Name:    CalcTickets
 *
 * Author:        Your Name
 * Creation Date: Friday, April 10 2015, 16:50 
 * Last Modified: Wednesday, August 26 2015, 14:17
 * 
 * Class Description:
 *
 */
import java.util.*;
public class CalcTickets
{
public static void main(String[] args)
{
   Scanner keyboard=new Scanner(System.in);
   System.out.print("Please enter ticket code >> ");
   String str=keyboard.next();
   str= str.toLowerCase();
   int len= str.length();
   int aCost= 0;
   int aaCost=0;
   int bCost=0;
   int cCost=0;
   double mCost= 0;
   double dCost=0;
   double mdCost= mCost+dCost;
   char l1=str.charAt(len-1);
   char l2=str.charAt(len-2);
   double totalCost=0;
   boolean startCheck=false;
   boolean midCheck=false;
   boolean endCheck=false;
   if (len>=6 && len<=9)
   {
  //===================check for A
   if(str.charAt(0)=='a')
   {
      if (str.charAt(1)=='a')
      {
       aaCost=200;
       totalCost+=aaCost;
       startCheck=true;
         }
      else if (Character.isDigit(str.charAt(1)))
      {
         aCost=150;
         totalCost+=aCost;
         startCheck=true;
      }
      else
      {
         System.out.println("Invalid Class ticket A");
         totalCost=0;
      }

   }
  // ======================================A finish
  // ========================check for B
  else if (str.charAt(0)=='b')
     {
      if ( Character.isDigit(str.charAt(1)))
      {
      bCost=100;
      totalCost+=bCost;
      startCheck=true;
     }
     else
   {
   System.out.println("Invalid Class Ticket B");
   totalCost=0;
   
   }
   }
   //============================B finish
   //==========================Check for C
   else if(str.charAt(0)=='c')
     {
        if(Character.isDigit(str.charAt(1)))
        {
           cCost=50;
           totalCost+=cCost;
           startCheck=true;
        }
        else
        {
           System.out.println("Invalid Class Ticket c");
           totalCost=0;
         }
   }
   else
  {
      System.out.println("Ticket should start with an alphabet(A/AA/B/C).");
   totalCost=0;
      }
     
  // =============================finish c
   //===================check for meal and drinks
   if (Character.isDigit(l1))
   {
      midCheck=true;
    }
   else
   {
  if (l1=='m' && Character.isDigit(l2))
      {
        mCost=35.75;
        totalCost+=mCost;
        endCheck=true;
         }
     else if (l1=='d' && Character.isDigit(l2))
     {
      dCost=24.90;
      totalCost+=dCost;
      endCheck=true;
        }
     else if (l1=='d' && l2=='m')
     {
        mdCost= 35.75+24.90;
        totalCost+=mdCost;
        endCheck=true;
        }
     else
     {
       System.out.println("Invalid ending of ticket code");
       totalCost=0;
      }
   }
   //===================finish meals and drinks
   if ((startCheck && midCheck) ==true || (startCheck && endCheck)==true)
   {
 
    System.out.printf("The cost of ticket %s is $ %.2f", str.toUpperCase(), totalCost);
    System.out.println();
 }

 else
 {
    System.out.println("Please check!!");
    }
    //=====================
 }
//======================================================
 else
 {
    System.out.println("Ticket format is not correct (invalid number of digits).");
    }
   }
}



