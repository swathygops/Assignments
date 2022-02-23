   
import java.util.LinkedList;
import java.util.List;
public class collectionL1Q4 {
	public static void main(String[] args) {
		List<String> date = new LinkedList<>();
	date.add("18-01-2000");
	date.add("18-01-2001");
	date.add("18-01-2002");
	date.add("18-01-2003");
	date.add("18-01-2004");
	date.add("18-01-2005");
		for(String it : date) 
		{
			String[] strings = it.split("-");
			if((int)Integer.parseInt(strings[2])%4==0)
			{
				if((int)Integer.parseInt(strings[2])%100==0) 
				{
					if((int)Integer.parseInt(strings[2])%400==0)
						System.out.println("Your Date of Birth is "+it+" and it was Leap Year");
					else {
						System.out.println("Your Date of Birth is "+it+" and it was not Leap Year");
					}
				}
				else {
					System.out.println("Your Date of Birth is "+it+" and it was Leap Year");
				}				
			}
			else {
				System.out.println("Your Date of Birth is "+it+" and it was not Leap Year");
			}
		}
	}
}