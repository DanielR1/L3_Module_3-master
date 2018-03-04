package abstract_classes.farm;

import java.util.ArrayList;

public class Farm {
public static void main(String[] args) {
	ArrayList <Animal> list = new ArrayList<Animal>();
	Pig pig = new Pig();
	Pig pig2 = new Pig();
	Cow cow = new Cow();
	Cow cow2 = new Cow();
	Sheep sheep = new Sheep();
	Chicken chicken = new Chicken();
	list.add(pig);
	list.add(pig2);
	list.add(cow);
	list.add(cow2);
	list.add(sheep);
	list.add(chicken);
	for (int i = 0; i < list.size(); i++) {
		list.get(i).makeNoise();
		list.get(i).color();
		
	}
	
}
}
