
public class Player
{
	static String name;
	static int money;
	public Player(String n, int m)
	{
		name=n;
		money=m;
	}
	public String getName()
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
	public void setMoney()
	{
		this.money=money;
	}
	public String toString()
	{
		return "Name: "+name+"; Economy:"+money;
	}
	public void playTime()
	{
		
	}
}
