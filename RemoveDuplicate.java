import java.util.Scanner;
public class RemoveDuplicate {
	public static void remove(String str)
	{
		String res="";
		int i=1;
		if(str.charAt(0)!=str.charAt(1))
		{
			res=res+str.charAt(0);
		}
		for(i=1;i<str.length()-1;i++)
		{
			if(str.charAt(i)!=str.charAt(i-1) && str.charAt(i)!=str.charAt(i+1))
			{
				res=res+str.charAt(i);
			}
		}
		if(str.charAt(i)!=str.charAt(i-1))
		{
			res=res+str.charAt(i);
		}
		System.out.println("The string after removing duplicates is:"+res);
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.next();
		remove(str);
		sc.close();
	}
}