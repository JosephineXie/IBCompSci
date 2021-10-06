import java.util.Random;
import java.util.Scanner;

public class MultiGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiGame g1 = new MultiGame();
	}

	public MultiGame()
	{
	   int RN1 = 0;
	   int RN2 = 0;
       int score = 0;
       int terms = 0;
       
       while(terms<10)
       {
       Scanner kb = new Scanner(System.in);
       Random r = new Random();
	   RN1 = r.nextInt(10)+2;
	   RN2 = r.nextInt(10)+2;
	   System.out.println("Numbers are:" + RN1 + " & " + RN2);
	   
	   int c = RN1 * RN2;
	   System.out.println("Please type in the product of those two numbers.");
	   int n = getNum();
	   //int n = getNum(4,144);
	   terms++;
	   
	   if(n == c)
	   {
		   System.out.println("Well done! score: +1");
		   score++;
	   }
	   else {
		   System.out.println("Wrong!");
	   }
      }
	  System.out.println("Your total score is:" + score);
	}    
	
	
	
	public int getNum()
	{
		int n = 0;
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter a number."); 
	    String ui = kb.nextLine();
		   try 
		   {
			 n = Integer.parseInt(ui);
		   }
		catch (Exception e)
		{
			System.out.println("WHOOPS!! that's not a number.");
		}
	
		return n;
	}
}



/*public int getNum(int low, int high)
{
	int n = 0;
	Scanner kb = new Scanner(System.in);
	
	while( n < low || n > high)
	{
		System.out.println("Please enter a number."); 
		String ui = kb.nextLine();
	   try 
	   {
		 n = Integer.parseInt(ui);
	   }
	catch (Exception e)
	{
		System.out.println("WHOOPS!! that's not a number.");
	}
}

	return n;*/
