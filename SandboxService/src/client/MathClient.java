package client;

import java.rmi.RemoteException;
import org.apache.axis2.AxisFault;
import client.MathServiceStub.Add2Ints;
import client.MathServiceStub.Add2IntsResponse;
import client.MathServiceStub.Multiply2Ints;
import client.MathServiceStub.Multiply2IntsResponse;

public class MathClient
{
	public MathClient()
	{
	}

	/**
	 * Invokes the add2Ints method on the web service and returns a String
	 * value with the result
	 * 
	 * @param val1
	 * @param val2
	 * @return
	 */
	public String add2Ints(String val1, String val2)
	{
		try
		{
			int int1 = Integer.parseInt(val1);
			int int2 = Integer.parseInt(val2);
			MathServiceStub stub = new MathServiceStub();

			Add2Ints add2Ints = new Add2Ints();
			add2Ints.setVal1(int1);
			add2Ints.setVal2(int2);

			Add2IntsResponse response = stub.add2Ints(add2Ints);

			return "" + response.get_return();
		}
		catch (AxisFault af)
		{
			return "Error... Unable to instantiate stub.";
		}
		catch (NumberFormatException nfe)
		{
			return "Error... Invalid input. Please enter two integers.";
		}
		catch (RemoteException re)
		{
			return "Error... Communication issue.";
		}
	}
	
	/**
	 * Invokes the multiply2Ints method on the web service and returns a String
	 * value with the result
	 * 
	 * @param val1
	 * @param val2
	 * @return
	 */
	public String multiply2Ints(String val1, String val2)
	{
		try
		{
			int int1 = Integer.parseInt(val1);
			int int2 = Integer.parseInt(val2);
			MathServiceStub stub = new MathServiceStub();

			Multiply2Ints multiply2Ints = new Multiply2Ints();
			multiply2Ints.setVal1(int1);
			multiply2Ints.setVal2(int2);

			Multiply2IntsResponse response = stub.multiply2Ints(multiply2Ints);

			return "" + response.get_return();
		}
		catch (AxisFault af)
		{
			return "Error... Unable to instantiate stub.";
		}
		catch (NumberFormatException nfe)
		{
			return "Error... Invalid input. Please enter two integers.";
		}
		catch (RemoteException re)
		{
			return "Error... Communication issue.";
		}
	}
}
