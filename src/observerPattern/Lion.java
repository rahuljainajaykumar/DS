package observerPattern;

public class Lion extends Animal{
	public Lion(Forest forest){
		this.forest=forest;
		this.forest.childCount(this);
	}
	public void display(){
		System.out.println("Total number of Animals:"+forest.getState());
	}
}
