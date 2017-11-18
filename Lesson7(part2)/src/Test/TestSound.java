package Test;

import com.java.main.Cat;
import com.java.main.Dog;
import com.java.main.Sounds;

public class TestSound {
	public static void main (String []args) {
		   Sounds animal [] = new Sounds[4];
		          animal[0] = new Dog("Woolf");
		          animal[1] = new Cat("Lion");
		          animal[2] = new Dog("puppey");
		          animal[3] = new Cat("kitty");
		          
		          for(Sounds a: animal) {
		        	  ((Sounds)a).MakeSound(20);
		          }
		
	}

}
