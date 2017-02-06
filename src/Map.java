import java.util.Scanner;
public class Map 
{
	public static void mapVersion()
	{
		System.out.println("So, what is the map version you want to play?");
		System.out.println("a: world version; any else key: colorado version.");
		Scanner scan=new Scanner(System.in);
		String answer=scan.nextLine();
		if(answer.equals("a"))
		{
			Board.setBoard("World");
		}
		else
		{
			Board.setBoard("Colorado");
		}
	}
}
