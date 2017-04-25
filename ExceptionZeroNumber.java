
import java.util.*;
public class ExceptionZeroNumber {

	public static void main(String[] args) {
		Random obj=new Random();
		int n=obj.nextInt(100);
		System.out.println("Number generated is: "+n);
		try
		{
			if(n==0)
                          throw AirthemeticException("Zero found");		
		}
		catch(Exception e)
		{
			System.out.println(e+"\nNumber contains a zero");
		}
	}

}
