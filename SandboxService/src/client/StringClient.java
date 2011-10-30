package client;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import client.StringServiceStub.LowerCase;
import client.StringServiceStub.LowerCaseResponse;
import client.StringServiceStub.Reverse;
import client.StringServiceStub.ReverseResponse;
import client.StringServiceStub.UpperCase;
import client.StringServiceStub.UpperCaseResponse;

public class StringClient
{
	public String reverse(String input)
	{		
		try
		{
			StringServiceStub stub = new StringServiceStub();
			Reverse reverseObj = new Reverse();
			reverseObj.setInput(input);
			ReverseResponse response = stub.reverse(reverseObj);
			return response.get_return();
		}
		catch (AxisFault af)
		{
			return "Error... Unable to create reverse service stub. " + af;
		}
		catch (RemoteException re)
		{
			return "Error... Communication issue.";
		}
	}
	
	public String upperCase(String input)
	{
		try
		{
			StringServiceStub stub = new StringServiceStub();
			UpperCase upperCaseObj = new UpperCase();
			upperCaseObj.setInput(input);
			UpperCaseResponse response = stub.upperCase(upperCaseObj);
			return response.get_return();
		}
		catch (AxisFault af)
		{
			return "Error... Unable to create upperCase service stub. " + af;
		}
		catch (RemoteException re)
		{
			return "Error... Communication issue.";
		}
	}
	
	public String lowerCase(String input)
	{
		try
		{
			StringServiceStub stub = new StringServiceStub();
			LowerCase lowerCaseObj = new LowerCase();
			lowerCaseObj.setInput(input);
			LowerCaseResponse response = stub.lowerCase(lowerCaseObj);
			return response.get_return();
		}
		catch (AxisFault af)
		{
			return "Error... Unable to create lowerCase service stub. " + af;
		}
		catch (RemoteException re)
		{
			return "Error... Communication issue.";
		}
	}
}
