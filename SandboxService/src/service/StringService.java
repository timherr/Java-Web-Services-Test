package service;

public class StringService
{
	public StringService() {}
	
	public String reverse(String input)
	{
		StringBuffer reversedString = new StringBuffer();
		
		for (int i=input.length()-1; i>=0; i--)
		{
			reversedString.append(input.charAt(i));
		}
		
		return reversedString.toString();
	}
	
	public String upperCase(String input)
	{
		return input.toUpperCase();
	}
	
	public String lowerCase(String input)
	{
		return input.toLowerCase();
	}
}
