package util;

public class Util
{
	private static final String HOST = "localhost";
	private static final String PORT = "8081";

	public static String getHost()
	{
		return HOST;
	}
	
	public static String getPort()
	{
		return PORT;
	}
	
	public static String getHostAndPort()
	{
		return HOST + ":" + PORT;
	}
}
