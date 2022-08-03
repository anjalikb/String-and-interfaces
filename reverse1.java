package String_assignment;

public class reverse1
{

	public static void main(String[] args) 
	{
	 String s="My Name Is Anjali";

	 System.out.println("REPLACING STRING");
     for(int i=s.length()-1;i>0;i--)
     {
    	 System.out.println(i+"\t"+s.charAt(i));
     }

     }
}
