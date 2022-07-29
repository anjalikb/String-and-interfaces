import java.util.*;
class String9
{
   public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the string by user");
    String s1=sc.nextLine();
    System.out.println("enter the character for search");
    char ch=sc.next().charAt(0);
     int c=0;

System.out.println("this element present in String");
   for(int i=0;i<s1.length();i++)
     {
          if(s1.charAt(i)==ch)
          {
           c++;
          }
     }
     if(c>0)
      System.out.println("charater found"+c+"times");
     else
      System.out.println("charater not found here");
 } 
} 