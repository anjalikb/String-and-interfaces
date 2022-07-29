import java.util.*;
class String5
{
   public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the string by user");
    String s1=sc.nextLine();
    

System.out.println("String in vertical form");
   for(int i=0;i<s1.length();i++)
     {
       char l=s1.charAt(i);
     
      System.out.println(l);
   }
 } 
} 