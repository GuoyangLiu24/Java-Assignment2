package guoyang_liu_exercise2;

import java.util.Scanner;

public class LottoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please choose a number between 3 to 27: "); // prompt user to input answer
		Scanner input = new Scanner(System.in);
		int userAnswer = input.nextInt(); // read the answer	
		input.close();//end read the user's answer.
		
		// create the for loop to ensure the user's answer is the right answer or wrong answer.
		for(int count=0, sum = 0; count<5 && sum != userAnswer; count++)
		{	
			Lotto lottoOne = new Lotto();
			int [] one = lottoOne.returnArray();
			sum = one[0]+one[1]+one[2];	
			System.out.println(sum);
			if (sum == userAnswer)
			{
				System.out.println("You win the game.");
			}else if (count == 4)
			{
				System.out.println("You lost the game.");
			}			
		}//end for loop		
	} // end main method
} // end class
