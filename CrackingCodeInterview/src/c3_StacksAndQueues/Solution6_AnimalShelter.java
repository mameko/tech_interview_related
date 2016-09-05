package c3_StacksAndQueues;

import java.util.LinkedList;

public class Solution6_AnimalShelter {

	LinkedList<Cat> catQ = new LinkedList<>();
	LinkedList<Dog> dogQ = new LinkedList<>();
	int idNumber = 0;

	public void enqueue(Animal animal) throws Exception {
		animal.id = idNumber++;
		if (animal instanceof Cat) {
			catQ.offer((Cat) animal);
		} else if (animal instanceof Dog) {
			dogQ.offer((Dog) animal);
		} else {
			throw new Exception("other animal");
		}
	}

	public Cat dequeCat() throws Exception {
		if (catQ.isEmpty()) {
			throw new Exception("no cat in the shelter");
		}

		return catQ.poll();
	}

	public Dog dequeuDog() throws Exception {
		if (dogQ.isEmpty()) {
			throw new Exception("no dogs in the shelter");
		}
		return dogQ.poll();
	}

	public Animal dequeuAny() throws Exception {
		if (catQ.isEmpty() && dogQ.isEmpty()) {
			throw new Exception("no animal in the shelter");
		} else if (catQ.isEmpty()) {
			return dogQ.poll();
		} else if (dogQ.isEmpty()) {
			return catQ.poll();
		}

		Animal cat = catQ.peek();
		Animal dog = dogQ.peek();

		return cat.id < dog.id ? catQ.poll() : dogQ.poll();

	}
}

class Animal {
	int id;
}

class Dog extends Animal {
	@Override
	public String toString() {
		return "Dog id: " + this.id;
	}
}

class Cat extends Animal {
	@Override
	public String toString() {
		return "Cat id: " + this.id;
	}
}