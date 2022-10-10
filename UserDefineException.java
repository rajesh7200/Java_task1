package pgm;

public class UserDefineException {
	
	static void driver() throws DriverException
	{
		int age=15;
		if(age>=18)
		{
			System.out.println("You eligible for lience & Safe Drive");
		}
		else
		{
			throw new DriverException("Be patient, wait until your age 18th");
		}
	}
	
	

	public static void main(String[] args) {
		try {
			driver();
		}
		catch(DriverException e)
		{
			System.out.println(e.getmsg());
		}

	}

}

class DriverException extends Exception
{
	String msg="";
	DriverException(String msg)
	{
		this.msg=msg;
	}
	public String getmsg()
	{
		return msg;
	}
}
