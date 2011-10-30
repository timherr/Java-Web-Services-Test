package web;

import javax.servlet.http.HttpServletRequest;

import client.MathClient;
import client.StringClient;

public class InputHandler
{
	public InputHandler()
	{
	}

	public static String handleInput(HttpServletRequest request)
	{
		String responseText = "";
		String action = request.getParameter("action");

		switch (action)
		{
			case "add2Ints":
			{
				String val1 = request.getParameter("val1");
				String val2 = request.getParameter("val2");

				MathClient client = new MathClient();
				responseText = client.add2Ints(val1, val2);
				break;
			}
			case "multiply2Ints":
			{
				String val1 = request.getParameter("val1");
				String val2 = request.getParameter("val2");

				MathClient client = new MathClient();
				responseText = client.multiply2Ints(val1, val2);
				break;
			}
			case "reverse":
			{
				String input = request.getParameter("input");
				
				StringClient client = new StringClient();
				responseText = client.reverse(input);
				break;
			}
			case "upperCase":
			{
				String input = request.getParameter("input");
				
				StringClient client = new StringClient();
				responseText = client.upperCase(input);
				break;
			}
			case "lowerCase":
			{
				String input = request.getParameter("input");
				
				StringClient client = new StringClient();
				responseText = client.lowerCase(input);
				break;
			}
			default:
			{
				responseText = "Unrecognized action!";
			}
		}

		return responseText;
	}
}
