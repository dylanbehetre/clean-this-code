package org.dythera.unclean;

import org.dythera.unclean.models.Person;
import org.dythera.unclean.models.Technozaure;

/** The goal of this app is to manage participants of an event called 'Technozaure' */
public class Main {
	public static void main(String[] args) {
		Technozaure t = new Technozaure();
		t.add(new Person("Jéremie", "Zenuka", 2));
		t.add(new Person("Dylan", "Zenika", 2));

		System.out.println(t.getAdded());
	}
}