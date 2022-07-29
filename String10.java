import java.util.*;
class String10
{
   public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the string by user");
    String str=sc.nextLine();
    

     int c=0;

System.out.println("this element present in String");
  char ch=sc.next().charAt(0);
   for(int i=0;i<str.length();i++)

     {
              if(str[i] == 'A' || str[i] == 'a' || str[i] == 'E' || str[i] == 'e' || str[i] == 'I' || str[i] == 'i' || str[i] == 'O' || str[i] == 'o' || str[i] == 'U' || str[i] == 'u')  
     
      System.out.println("charater is vowel");
     else
      System.out.println("this is consonent");
    } 
}
}