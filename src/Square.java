
public class Square extends Board
{
	 int order;
	 String name;
	 int value;
	 String color;
	//static String special;
	 boolean permission;
	 String occupation;
	 int number;
	public Square(int or, String na, int va, String co, boolean pe, String oc, int nu)
	{
		order=or;
		name=na;
		value=va;
		color=co;
		//special=sp;
		permission=pe;
		occupation=oc;
		number=nu;
	}
	
	public  int getOrder() {
		return order;
	}

	public  void setOrder(int order) {
		this.order = order;
	}

	public  String getName() {
		return name;
	}

	public  void setName(String name) {
		this.name = name;
	}

	public  int getValue() {
		return value;
	}

	public  void setValue(int value) {
		this.value = value;
	}

	public  String getColor() {
		return color;
	}

	public  void setColor(String color) {
		this.color = color;
	}

	public  boolean isPermission() {
		return permission;
	}

	public  void setPermission(boolean permission) {
		this.permission = permission;
	}

	public  String getOccupation() {
		return occupation;
	}

	public  void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public  int getNumber() {
		return number;
	}

	public  void setNumber(int number) {
		this.number = number;
	}

	public String toString()
	{
		return "Order: "+order+"; Name:"+name+"; Value: "+value+"; Color:"+color+"; Permission:"+permission+"; Occupation:"+occupation+"; Number:"+number;
	}
}
