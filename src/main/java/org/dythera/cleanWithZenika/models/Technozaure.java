package org.dythera.cleanWithZenika.models;

import java.util.Set;

public class Technozaure {

	private static final int EVENT_CAPACITY = 80;

	private ParticipantPool participantPool;

	public Technozaure() {
		participantPool = new ParticipantPool(EVENT_CAPACITY);
	}

	public void register(Participant participant) throws NoPoolPlaceException {
		if (canRegister(participant)) {
			participantPool.add(participant);
		}
	}

	public Set<Participant> getRegisteredParticipants() {
		return participantPool.getParticipants();
	}

	private boolean canRegister(Participant participant) {
		return isZenikaEmployee(participant) && participant.hasJazzBudget(1);
	}

	private static boolean isZenikaEmployee(Participant participant) {
		return participant.employer() == EEmployer.ZENIKA;
	}

}
