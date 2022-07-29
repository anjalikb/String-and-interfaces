import java.util.*;
class String4
{
   public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the string by user");
    String s1=sc.nextLine();
    char ch=s1.charAt(0);
System.out.println("this is first character in String");
   System.out.println(ch);
System.out.println("this is last character in String");
    System.out.println(s1.charAt(s1.length()-1));
}
 }    