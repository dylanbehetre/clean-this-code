package org.dythera.cleanWithZenika.models;

import java.util.HashSet;
import java.util.Set;

public class ParticipantPool {

	private Set<Participant> participants;
	private int maxSizecapacity;

	public ParticipantPool(int maxSize) {
		participants = new HashSet<Participant>();
		maxSizecapacity = 80;
	}

	public void add(Participant participant) throws NoPoolPlaceException {
		if (participants.size() >= maxSizecapacity) {
			throw new NoPoolPlaceException();
		}

		participants.add(participant);

	}

	public Set<Participant> getParticipants() {
		return participants;
	}
}
