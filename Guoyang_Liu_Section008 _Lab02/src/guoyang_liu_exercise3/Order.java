package guoyang_liu_exercise3;

public class Order {
	//create a method sort numbers.
	public static void SortNumbers(double number1,double number2,double number3, double number4, double number5
			,double number6,double number7,double number8, double number9, double number10)
	{		
		//initialize an array contain the arguments
		double[] numbersArray = {number1,number2,number3,number4,number5,number6,number7,number8,number9,number10,};
		
		//create a loop to check every arguments is greater or less than another the number and ensure the order of the numbers
		double temp;
		   for (int i = 1; i < numbersArray.length; i++) 
		   {
			   for (int j = i; j > 0; j--) 
			   {
				   if (numbersArray[j] < numbersArray [j - 1]) 
				   {
					   temp = numbersArray[j];
					   numbersArray[j] = numbersArray[j - 1];
					   numbersArray[j - 1] = temp;
				   }
			   }
		   }//end for loop
		   
		   for (int i = 0; i < numbersArray.length; i++) 
		   {
			   	System.out.println(numbersArray[i]);
		   }// end for loop
	}// end sort numbers method
}// end class
