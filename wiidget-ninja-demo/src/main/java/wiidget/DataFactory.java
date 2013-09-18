package wiidget;

import java.util.ArrayList;
import java.util.List;

import org.landa.wiidget.Wiidget;

public class DataFactory extends Wiidget {

	@Override
	public void run() {
	}

	public List<Animal> getAnimals() {

		final List<Animal> animals = new ArrayList<>();

		animals.add(new Animal("Bömbi", 2));
		animals.add(new Animal("Lion", 1));
		animals.add(new Animal("Cica", 21));
		animals.add(new Animal("Buksi", 12));
		animals.add(new Animal("Fekete", 43));
		animals.add(new Animal("Mirci", 4));
		animals.add(new Animal("Jumbó", 5));
		animals.add(new Animal("Bagira", 5));
		animals.add(new Animal("Kacsa", 6));
		animals.add(new Animal("Brúnó", 7));
		animals.add(new Animal("Guga", 2));
		animals.add(new Animal("Baba", 3));

		return animals;

	}

	public static class Animal {
		public String name;
		public Integer age;

		public Animal(final String name, final Integer age) {
			super();
			this.name = name;
			this.age = age;
		}

	}

}
