import java.util.*;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Game g1 = new Game();
	}

	public Game()
	{
		int RN = 0;
		int n = 0;
		Scanner kb = new Scanner(System.in);
		Random r = new Random();
		RN = r.nextInt(100)+1;
		
		while(n != RN)
		{
		  /*System.out.println("Please guess a number."); 
		  n = kb.nextInt();*/
			
		  n= getNum(1,100);
		  
		  if(n>RN)
		  {
			  System.out.println("Guess Lower");
		  }
		  else if (n == RN)
		  {
			  System.out.println("Well done!!");
		  }
		  else
		  {
			  System.out.println("Guess Higher");
		  }
		}
	}

	public int getNum(int low, int high)
	{
		int n = 0;
		Scanner kb = new Scanner(System.in);
		try 
		{
			
		System.out.println("Please enter a number."); 
		n = kb.nextInt();
		
		}
		catch (Exception e)
		{
			System.out.println("WHOOPS!!");
		}
		
		while( n < low || n > high)
		{
			System.out.println("Not accepted,try again.");
			n = kb.nextInt();
		
		}
		
		return n;
	}
}
