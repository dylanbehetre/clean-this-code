package org.dythera.unclean.models;

import java.util.HashSet;
import java.util.Set;

public class Technozaure {

	private Set<Person> set;
	private int capacity;

	public Technozaure() {
		set = new HashSet<Person>();
		capacity = 80;
	}

	public boolean add(Person person) {
		if (!person.employer().equals("Zenika") || person.jazz() < 1 || capacity <= 0) {
			return false;
		}
		set.add(person);
		capacity--;
		return true;
	}

	public Set<Person> getAdded() {
		return set;
	}

	public int getCapacity() {
		return capacity;
	}
}
