import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class MainMenu 
{
	static String name;
	static int money;
	public static void main (String args[]) throws InterruptedException
	{
		introduction();
		Player p=new Player(name, money);//the only way to create an object after doing blueprint in "Player" class
		Map.mapVersion();
		Play.playTime();
	}
	public static void introduction() throws InterruptedException
	{
		
		System.out.println("Welcome to the Monopoly Game!");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("Let's get ready to rumbleeeeeeee.");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("Just kidding. This is serious.");
		System.out.println("Please enter your name.");
		Scanner scan=new Scanner(System.in);
		name=scan.nextLine();
		System.out.println("Now enter the amount of money you and your opponent want to have.");
		Scanner scan1=new Scanner(System.in);
		money=scan.nextInt();
		if(money<=0)
		{
			System.out.println("That's not how this game works. Let's go back and restart.");
			introduction();
		}
	}
}
 