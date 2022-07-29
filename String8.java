import java.util.*;
class String8
{
   public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the string by user");
    String s1=sc.nextLine();
   System.out.println("this is odd element in String");
   for(int i=0;i<s1.length();i++)
     {
          if(i%2!=0)
          {
           System.out.println(i+ " "+s1.charAt(i));
          }
     }
 } 
} 