package org.dythera.cleanedByMe;

import org.dythera.cleanedByMe.models.EEmployer;
import org.dythera.cleanedByMe.models.Participant;
import org.dythera.cleanedByMe.models.Technozaure;

/** The goal of this app is to manage participants of an event called 'Technozaure' */
public class Main {
	public static void main(String[] args) {
		Technozaure t = new Technozaure();
		t.register(new Participant("Jéremy", EEmployer.ZENIKA, 2d));
		t.register(new Participant("Dylan",  EEmployer.ZENIKA, 2d));

		System.out.println(t.getParticipants());
	}
}