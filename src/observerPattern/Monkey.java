package observerPattern;

public class Monkey extends Animal{
	public Monkey(Forest forest){
		this.forest=forest;
		this.forest.childCount(this);
	}
	public void display(){
		System.out.println("Total number of Animals:"+forest.getState());
	}
}
