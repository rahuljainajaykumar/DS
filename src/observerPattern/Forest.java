package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class Forest {
	private int count;
	private List<Animal> ls=new ArrayList<Animal>();
	
	public void setState(int count){
		this.count=count;
		notifyAllAnimals();
	}
	
	public int getState(){
		return count;
	}
	
	public void childCount(Animal animal){
		ls.add(animal);
	}
	
	public void notifyAllAnimals(){
		for(Animal animal:ls){
			animal.display();
		}
	}
}
