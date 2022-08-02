package String_assignment;

public class even_odd {

	public static void main(String[] args)
	{
		String s="MY NAME IS ANJALI ";
		System.out.println("this is even position");
		  for(int i=0;i<s.length();i++)
		  {
			  if(i%2==0)
				  System.out.println(i +" \t "+s.charAt(i));
		  }
		  System.out.println("this is odd position");
		  for(int i=0;i<s.length();i++)
		  {
			  if(i%2!=0)
				  System.out.println(i +" \t "+s.charAt(i));
		  }

	}

}