import java.util.*;
class String11
{
    public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
      System.out.println("enter the String");
   String  Str=sc.nextLine();
   int space=0;
   int uppercase=0;
int lowercase=0;
   
  for( int i=0;i<Str.length();i++)
{
   char ch=Str.charAt(i);
   if(ch==' ')
  
    space++;
  

   else if(ch>=65 && ch<=90)
  
   uppercase++;
  

   else if(ch>=97 && ch<=122)
  
   lowercase++;
  
}  
    System.out.println("space are found "+space+" times");
    System.out.println("upper case elemets are found "+uppercase+" times");
    System.out.println("lower case elemets are found "+lowercase+" times");
}
}