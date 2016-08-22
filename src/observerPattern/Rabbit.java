package observerPattern;

public class Rabbit extends Animal{
	public Rabbit(Forest forest){
		this.forest=forest;
		this.forest.childCount(this);
	}
	public void display(){
		System.out.println("Total number of Animals:"+forest.getState());
	}
}
