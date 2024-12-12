package org.dythera.cleanWithBiocoop.models;

import java.util.HashSet;
import java.util.Set;

public class Technozaure {

	private final static int INITIAL_CAPACITY = 80;

	private final Set<Participant> participants;
	private int availableSlot;

	public Technozaure() {
		this.participants = new HashSet<>();
		this.availableSlot = INITIAL_CAPACITY;
	}

	public boolean register(Participant participant) {
		final boolean participantRegistered;

		if (couldRegisterParticipant(participant)) {
			this.participants.add(participant);
			this.decreaseAvailableSlotBy(1);
			participantRegistered = true;
		} else {
			participantRegistered = false;
		}

		return participantRegistered;
	}

	public int getAvailableSlot() {
		return this.availableSlot;
	}

	private boolean couldRegisterParticipant(Participant participant) {
		return participant.isZenikaEmployee() && participant.hasJazzBudget() && hasAvailableSlot();
	}

	private boolean hasAvailableSlot() {
		return availableSlot > 0;
	}

	private void decreaseAvailableSlotBy(int slotNumber) {
		this.availableSlot = this.availableSlot - slotNumber;
	}

	/* Getters */
	public Set<Participant> getParticipants() {
		return this.participants;
	}

}
