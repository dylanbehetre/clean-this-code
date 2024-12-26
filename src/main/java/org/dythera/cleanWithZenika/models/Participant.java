package org.dythera.cleanWithZenika.models;

public record Participant(String name, EEmployer employer, Integer jazz) {

	public boolean hasJazzBudget(Integer jazzCost) {
		return this.jazz >= jazzCost;
	}
}
