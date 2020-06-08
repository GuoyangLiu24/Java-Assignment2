package guoyang_liu_exercise2;
import java.security.SecureRandom;

public class Lotto {
	//initialize the random object and lotto array
	private static SecureRandom randomObject = new SecureRandom();
	static int lottoArray[] = new int [3];
	
	//create the Lotto class's constructor
	public Lotto ()
	{	
		int [] newLottoArray = new int [3];
		for(int i=0; i < lottoArray.length; i++)
	 {		
		 int newNumber = randomObject.nextInt( 9 )+1;
		 newLottoArray[i]=newNumber;
	 }
		lottoArray = newLottoArray;
	}// end the Lotto constructor

	//create a method that return the renew array
	public  int[] returnArray()
	{	
		return lottoArray;
	}// end method
}//end class
