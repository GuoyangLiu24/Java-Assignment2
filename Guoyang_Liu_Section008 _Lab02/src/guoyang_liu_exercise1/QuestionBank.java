package guoyang_liu_exercise1;

import java.security.SecureRandom;

import java.util.Scanner;
import java.util.ArrayList;

public class QuestionBank {
	
	static String[] rightAnswer = {"b","b","c","d","a"}; //initialize the right answer array.
	
	//initialize the questions array
	String[] question = {
			"Q1: Arrays are ________.\r\n" + 
			"a. variable-length entities\r\n" + 
			"b. fixed-length entities\r\n" + 
			"c. data structures that contain up to 10 related data items\r\n" + 
			"d. used to draw a sequence of lines, or “rays” ",
			"Q2: Which of the following statements about arrays are true?\r\n" + 
			"A. An array is a group of variables containing values that all have the same type.\r\n" + 
			"B. Elements are located by index.\r\n" + 
			"C. The length of an array c is determined by the expression c.length();.\r\n" + 
			"D. The zeroth element of array c is specified by c[0].\r\n" + 
			"a. A, C, D.\r\n" + 
			"b. A, B, D.\r\n" + 
			"c. C, D.\r\n" + 
			"d. A, B, C, D.",
			"Q3: Consider the array:\r\n" + 
			"s[0] = 7 s[1] = 0 s[2] = -12 s[3] = 9 s[4] = 10 s[5] = 3 s[6] = 6\r\n" + 
			"The value of s[s[6] - s[5]] is:\r\n" + 
			"a. 0.\r\n" + 
			"b. 3.\r\n" + 
			"c. 9.\r\n" + 
			"d. 10.",
			"Q4: A programmer must do the following before using an array:\r\n" + 
			"a. declare then reference the array.\r\n" + 
			"b. create then declare the array.\r\n" + 
			"c. create then reference the array.\r\n" + 
			"d. declare then create the array.",
			"Q5: Consider the code segment below. Which of the following statements is false?\r\n" + 
			"int[] g; g = new int[23];\r\n" + 
			"a. The value of g[3] is -1.\r\n" + 
			"b. The first statement declares an array reference.\r\n" + 
			"c. The second statement creates the array.\r\n" + 
			"d. g is a reference to an array of integers."
			};	
	
	//create a method that simulate the questions.
	public static void simulateQuestion(String question)
	{						
		System.out.println(question); // prompt for input
	}//end simulate question method.
	
	// create a method to show the question, read user's answer, check user's answer and response appropriate message.
	public void inputAnswer()
	{
		int score = 0;
		Scanner input = new Scanner(System.in);
		for(int i = 0; i<5;i++)
		{
		simulateQuestion(question[i]);
		
		System.out.println("Please choose your answer: "); // prompt user to input answer	
		String userAnswer = input.nextLine(); // read first answer
		String oneAnswer = checkAnswer(userAnswer,i);
		
		if(oneAnswer=="true")
		{
			score++;
		}
		generateMessage (oneAnswer);			
		}
		
		System.out.println("You got "+ score+ " out of " + question.length + " or " + score/5*100 + "%."); // print the test result.
	}// end input answer method
	
	//create a method for checking the user's answer is the same as the right answer.
	public  String checkAnswer(String userAnswer, int i)
	{
		
		if (userAnswer == rightAnswer[i])
		{
			userAnswer = "true";
		}else
		{
			userAnswer = "false";
		}			
		return userAnswer;
	}// end check answer method
	
	//create method to generate appropriate  message randomly.
	private static SecureRandom randomObject = new SecureRandom();
	public  void generateMessage (String userAnswer)
	{
		String response = null;
		if ( userAnswer == "true")
		{
		switch ( randomObject.nextInt( 4 ) )
		{
		case 0:
			 response = "Very good!" ;
			break;
			
		case 1:
			 response ="Good!" ;
			break;
			
		case 2:
			 response =  "Keep up the good work!" ;
			break;
			
		case 3:
			 response =  "Nice work!" ;	
			break;
		} // end switch loop		
		
		}else
		{
			switch ( randomObject.nextInt( 4 ) )
			{
			case 0:
				 response= "No. Please try again" ;
				 break;
				
			case 1:
				 response= "Wrong. Try once more" ;
				 break;
				
			case 2:
				 response= "Don't give up!" ;
				 break;
				
			case 3:
				 response="No. Keep trying.." ;	
				 break;				 
			}// end switch loop			
		}// end if else loop
		System.out.println(response); // print the appropriate message for the useer's answer.		
	}//end generate message method
		
}// end class
