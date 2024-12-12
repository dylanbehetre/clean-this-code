package org.dythera.cleanWithBiocoop;

import org.dythera.cleanWithBiocoop.models.Participant;
import org.dythera.cleanWithBiocoop.models.Technozaure;

/** The goal of this app is to manage participants of an event called 'Technozaure' */
public class Main {
	public static void main(String[] args) {
		Technozaure technozaureEvent = new Technozaure();
		technozaureEvent.register(new Participant("Jéremie", "Zenuka", 2));
		technozaureEvent.register(new Participant("Dylan", "Zenika", 2));

		System.out.println(technozaureEvent.getParticipants());
	}
}