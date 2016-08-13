
import java.security.*;
import java.math.*;


public class PassGen {

	private SecureRandom randd = new SecureRandom();
	
	public String getPass()
	{
		return new BigInteger (130, randd).toString( 32 );
	}
}
