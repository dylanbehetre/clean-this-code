package org.dythera.cleanedByMe.models;

import java.util.HashSet;
import java.util.Set;

public class Technozaure {

	private static final double JAZZ_COST = 0.5;

	private final Set<org.dythera.cleanedByMe.models.Participant> participants;
	private int availablePlace;

	/**
	 * Constructor (by default)
	 */
	public Technozaure() {
		this.participants = new HashSet<>();
		this.availablePlace = 80;
	}

	/**
	 * Method used to register at the event
	 *
	 * @param participant participant expecting to register
	 * @return true if participant is successfully registered
	 */
	public boolean register(org.dythera.cleanedByMe.models.Participant participant) {
		if (this.couldParticipate(participant)) {
			this.participants.add(participant);
			this.availablePlace--;
			return true;
		} else {
			return false;
		}
	}

	public boolean hasAvailablePlace() {
		return this.availablePlace > 0;
	}

	private boolean couldParticipate(org.dythera.cleanedByMe.models.Participant participant) {
		return participant.isEmployeeOf(org.dythera.cleanedByMe.models.EEmployer.ZENIKA)
			   && participant.hasJazzBudget(JAZZ_COST)
			   && this.hasAvailablePlace();
	}

	/* Getters */
	public Set<org.dythera.cleanedByMe.models.Participant> getParticipants() {
		return participants;
	}

	public int getAvailablePlace() {
		return availablePlace;
	}
}
