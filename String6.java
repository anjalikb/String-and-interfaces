import java.util.*;
class String6
{
   public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the string by user");
    String s1=sc.nextLine();
    System.out.println("enter the character for search");
    char ch=sc.next().charAt(0);

System.out.println("this element present in String");
   for(int i=0;i<s1.length();i++)
     {
          if(s1.charAt(i)==ch)
          {
           System.out.println(ch + " Character is found");
          else
           System.out.println(ch + " Character is  not found");
          }
     }
 } 
} 