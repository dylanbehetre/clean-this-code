package org.dythera.cleanedByMe.models;

import java.util.Objects;

public final class Participant {

	private final String name;
	private final EEmployer employer;
	private Double jazz;

	public Participant(String name, EEmployer employer, Double jazz) {
		this.name = name;
		this.employer = employer;
		this.jazz = jazz;
	}

	public boolean isEmployeeOf(EEmployer employer) {
		return this.employer == employer;
	}

	public boolean hasJazzBudget(double jazzCost) {
		return jazzCost <= jazz;
	}

	public void debitJazz(double jazzCost) {
		this.jazz = this.jazz - jazzCost;
	}

	/* Getters */
	public String getName() {
		return name;
	}

	public EEmployer getEmployer() {
		return employer;
	}

	public Double getJazz() {
		return jazz;
	}

	/* Object overridden methods */
	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		var that = (Participant) obj;
		return Objects.equals(this.name, that.name) && Objects.equals(this.employer, that.employer) && Objects.equals(this.jazz, that.jazz);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, employer, jazz);
	}

	@Override
	public String toString() {
		return "Participant[" + "name=" + name + ", " + "employer=" + employer + ", " + "jazz=" + jazz + ']';
	}
}
