package javadsa;

public class ReverseStringByRecursion {
public static void main(String[] args) {
		
		String s = "rahul";
		printt(s,s.length()-1);
		
	}
	static void printt(String s, int index)
	{
		if(index < 0)
		{
			return;
		}
		System.out.print(s.charAt(index));
		printt(s,--index);
		
	}

}
