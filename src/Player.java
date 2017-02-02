import java.util.Scanner;
public class Player 
{
	String name;
	int money;
	static Player p=new Player(MainMenu.name, MainMenu.money);
	public Player(String n, int m)
	{
		name=n;
		money=m;
	}
	public  String getName()
	{
		return name;
	}
	public void setName()
	{
		this.name=name;
	}
	public int getMoney()
	{
		return money;
	}
	public void setMoney(int money)
	{
		this.money=money;
	}
	public String toString()
	{
		return "Name: "+name+"; Economy:"+money;
	}
	
}
