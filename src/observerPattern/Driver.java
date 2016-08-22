package observerPattern;

public class Driver {
public static void main(String[] args) {
	Forest forObj=new Forest();
	new Lion(forObj);
	new Monkey(forObj);
	new Rabbit(forObj);
	System.out.println("Initial");
	forObj.setState(10);
	System.out.println("Updating");
	forObj.setState(20);
}
}
