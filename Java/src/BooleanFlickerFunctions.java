import java.util.Random;
import java.util.concurrent.TimeUnit;

/*Stack Overflow Question: http://stackoverflow.com/questions/40197380/make-boolean-switch-between-true-and-false-rapidly/40197608#40197608
 * 
 * I'm currently working on an assignment that states we must make an expanding and shrinking circle turn red and "flicker" when we move the mouse over it. 
 * I didn't have an issue with the first segment but I'm having trouble wrapping my head around the second part. 
 *
 * This is the clue I received to make it "flicker"(disappear and reappear rapidly):
 * There are many ways to do this, such as using a boolean variable called doDraw to determine if the circle should be drawn. When blinking, each time invert this variable so that it rapidly goes between true and false. 
 * When the mouse is outside the circle, always have this set to true.
 * I'm having a hard time understanding this but I believe I have to create a boolean function that will switch between true and false rapidly?
 */

public class BooleanFlickerFunctions 
{
	private static int flickerNumber;
	private static Random randomNumGenerator = new Random();
	
	public static void main(String[] args) throws InterruptedException
	{
		while (true)
		{
			//System.out.println(isSolidRandom()); //Either use this one or 
			//System.out.println(isSolidRandom()); //this one 
		}
	}
	
	public static boolean isSolid() throws InterruptedException //This performs the flicker in a uniform fashion (on, off, on, off, on, etc.)
	{
		
		while (true)
		{
			TimeUnit.SECONDS.sleep(1);  //This is how fast the flicker changes
			flickerNumber = flickerNumber + 1;
			
			if(flickerNumber % 2 == 0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
	}
	
	public static boolean isSolidRandom () throws InterruptedException //This performs the flicker in a non-uniform fashion (on, off, off, off, on, off, on, etc.)
	{
		while (true)
		{
			TimeUnit.SECONDS.sleep(1);  //This is how fast the flicker changes
			flickerNumber = randomNumGenerator.nextInt(100);
			if(flickerNumber % 2 == 0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	}
}
