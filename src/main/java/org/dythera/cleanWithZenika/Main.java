package org.dythera.cleanWithZenika;

import org.dythera.cleanWithZenika.models.EEmployer;
import org.dythera.cleanWithZenika.models.NoPoolPlaceException;
import org.dythera.cleanWithZenika.models.Participant;
import org.dythera.cleanWithZenika.models.Technozaure;

/** The goal of this app is to manage participants of an event called 'Technozaure' */
public class Main {
	public static void main(String[] args) throws NoPoolPlaceException {
		Technozaure technozaure = new Technozaure();
		technozaure.register(new Participant("Jéremie", EEmployer.ZENIKA, 2));
		technozaure.register(new Participant("Dylan", EEmployer.ZENIKA, 2));

		System.out.println(technozaure.getRegisteredParticipants());
	}
}
