/*
 * Class Name:    rf
 *
 * Author:        Your Name
 * Creation Date: Wednesday, April 08 2015, 19:27 
 * Last Modified: Saturday, April 16 2016, 15:30
 * 
 * Class Description:
 *
 */
import java.util.*;
import java.io.*;

public class AirportCodes1
{
public static void main(String[] args) throws IOException
{
Scanner fscanner= new Scanner(System.in);
System.out.println("Please enter the file name to read data:");
File fname=new File(fscanner.nextLine());
   try
   {
fscanner=new Scanner(fname);
Scanner keyboard= new Scanner(System.in);
System.out.println("Please provide airport name: ");
String str= keyboard.nextLine();
str=str.toUpperCase();
String lst="";
int a, b;
boolean found=false;
while(fscanner.hasNextLine())
{
   lst= fscanner.nextLine();
   lst= lst.toUpperCase(); 
    if (lst.contains(str))
   {
      found=true;
      str= str.trim();
      a=lst.indexOf(str)-2;
      b= lst.indexOf(str)-5;
      String f=lst.substring(b,a);
      System.out.printf("Airport : %s has IATA code : %1s", str, f);
   System.out.println();
   }
 
}
if(found==false) 
   {
      System.out.printf("IATA code for %s not found. Please check the airport name.", str);
System.out.println();
            }

fscanner.close(); 
}

catch(FileNotFoundException e)
{
   
   System.out.printf("File %s not found.", fname);
   System.out.println();
   }
}
}
