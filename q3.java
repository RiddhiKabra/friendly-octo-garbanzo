/* Write a java program which accept string from user and return  difference between frequency of small characters and frequency of capital characters.
Input : “MarvellouS”
Output : 6 (8-2)*/
import java.util.*;
class q3
{
   public static void main(String Args[])
   {
      int iRet=0;
      StringDemo sobj=new StringDemo();
      sobj.Accept();
     
      iRet=sobj.CountDiff();
      System.out.println("Difference is:"+iRet);
   }
}

class StringX
{
   public String str;
   public void Accept()
   {
      Scanner sobj= new Scanner(System.in);
      System.out.println("Enter String:");
      str=sobj.nextLine();
   }
   public void Display()
   {
      System.out.println("Entered String is:"+str);
   }

}

class StringDemo extends StringX
{
  public int CountDiff()
  {
    char Arr[]=str.toCharArray();
    int SCount=0,i=0,CCount=0,iDiff=0;
    for(i=0;i<Arr.length;i++)
    {
      if((Arr[i]>='a') && (Arr[i]<='z'))
      {
         SCount++;
      }
     else if((Arr[i]>='A') && (Arr[i]<='Z'))
         {
               CCount++;
         }
   }
      {
          iDiff= (SCount-CCount);
      }
return  iDiff;
  }
}