/*
 * Class Name:    AirportCodes2
 *
 * Author:        Your Name
 * Creation Date: Saturday, April 11 2015, 14:34 
 * Last Modified: Saturday, April 16 2016, 15:31
 * 
 * Class Description:
 *
 */
import java.util.*;
import java.io.*;

public class AirportCodes2
{
public static void main(String [] args) throws IOException
{
   Scanner fscan=new Scanner(System.in);
   System.out.println("Please enter the file to read data : ");
   String d= fscan.nextLine();
   File fname=new File(d);
   boolean found=false;
   try
   {
     Scanner fscanner= new Scanner(fname);
     System.out.println(fname);
     if(fscanner.hasNextLine())
      {
         int userChoice;
         do 
  {
     System.out.println();
     System.out.println("Airport Finder");
     System.out.println("     1. Enter Airport");
     System.out.println("     2. Close");
     System.out.print("Enter Choice >> ");
     Scanner s= new Scanner(System.in);
     userChoice=s.nextInt();
//===========
if (userChoice==1)
{
   System.out.println();
   System.out.print("Enter IATA code >> ");
   Scanner s1=new Scanner(System.in);
   String iata= s1.nextLine();
   iata=iata.toUpperCase();
   File f=new File((d));
   Scanner s2= new Scanner(f);
   int counter=0;
   boolean founddata=false;
   while(s2.hasNextLine())
{
   String lst=s2.nextLine();
   if(lst.contains(iata))
   {
      String AirportName, DestAirportName, DestIATACode;
      founddata=true;
      if(lst.indexOf(iata) == 0 && counter ==0)
      {
         counter++;
         AirportName=lst.substring(5,lst.indexOf(",",5));
         System.out.printf("%s (%1s) airport connects to :\n", AirportName, iata);
      }
      else if (lst.indexOf(iata) !=0 && counter ==0)
      {
      counter++;
      AirportName=lst.substring(lst.lastIndexOf(",")+2);   
      System.out.printf("%s (%1s) airport connects to :\n", AirportName, iata);
      }
      else
      {}
     if(lst.indexOf(iata) ==0)
   {  
   AirportName= lst.substring(5,lst.indexOf(",",5));
   DestIATACode=lst.substring(lst.indexOf(",",5)+2, lst.indexOf(",",5)+5);
   DestAirportName=lst.substring(lst.lastIndexOf(",")+2);
   System.out.printf("\t %s airport (%1s) \n", DestAirportName, DestIATACode);
   }
   else
   {
   AirportName=lst.substring(lst.lastIndexOf(",")+2);
   DestIATACode=lst.substring(0,3);
   DestAirportName=lst.substring(5,lst.indexOf(",",5));
   System.out.printf("\t %s airport (%1s) \n", DestAirportName, DestIATACode);
   }
      }
}
if (founddata==false)
{
  System.out.println("Data not found.");
   }
   //==============while end
   s2.close();
}
//====choice 1 end

else if (userChoice==2)
{
   System.out.println("Program now closing"); 
}
   //==============
else
   {
      System.out.println("Invalid menu choice");
    }
     }
  //=============================do end     
while (userChoice !=2);
      }
      else
   {
      System.out.println("File is empty");
      }
fscanner.close();
   }
 //===============================
catch (FileNotFoundException e)
{
   System.out.printf("File %s not found.",fname);
  System.out.println();
   }
      }

}
