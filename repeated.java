import java.util.*;
class repeated
{
   public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     int a[]=new int[10];
     int i,j;
 System.out.println("enter the elements in array");
   for(i=0;i<10;i++)
    {
        a[i]=sc.nextInt();
    }
    System.out.println("this is reapeted elements in array");
    for(i=0;i<10;i++)
    {
      for(j=i+1;j<a.length;j++)
       {
              if(a[i]==a[j])
            {
                System.out.println(a[i]);
             
            } 
         }
      }
    }
}