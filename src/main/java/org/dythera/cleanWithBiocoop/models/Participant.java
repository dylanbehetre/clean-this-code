package org.dythera.cleanWithBiocoop.models;

public record Participant(String name, String employer, Integer jazz) {

	public boolean isZenikaEmployee() {
		return this.employer().equals("Zenika");
	}

	public boolean hasJazzBudget() {
		return this.jazz() > 0;
	}
}
