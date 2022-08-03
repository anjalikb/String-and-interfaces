package String_assignment;
import java.util.*;
public class first_occurance {

	public static void main(String[] args) 
	{
		String s1;
		char ch;
		int i;
		Scanner sc= new Scanner(System.in);

		System.out.print("\nPlease Enter String to find First Occurrence =  ");
		s1 = sc.nextLine();
		
		System.out.print("\nEnter the Character to Find =  ");
		ch = sc.next().charAt(0);
		for(i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==ch)
				System.out.println("first character find in occurance"+ch+"\t"+i);
		}
			
		
	}

}