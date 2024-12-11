package org.dythera.cleanedByMe.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TechnozaureTest {

	@Test
	void register_givenZenikaEmployeeWithEnoughJazzBudget_whenRegistering_thenRegistered() {
		// arrange
		final Technozaure testedTechnozaure = new Technozaure();
		final int initialNumberOfPlace = testedTechnozaure.getAvailablePlace();
		
		// act
		boolean result = testedTechnozaure.register(new Participant("Dylan", EEmployer.ZENIKA, 2d));

		// assert
		Assertions.assertTrue(result);
		
		final int expectedNumberOfParticipant = 1;
		final int actualNumberOfParticipant = testedTechnozaure.getParticipants().size();
		Assertions.assertEquals(expectedNumberOfParticipant, actualNumberOfParticipant);
		
		final int expectedNumberOfAvailablePlaceAfterRegistering = initialNumberOfPlace - actualNumberOfParticipant;
		final int actualNumberOfAvailablePlaceAfterRegistering = testedTechnozaure.getAvailablePlace();
		Assertions.assertEquals(expectedNumberOfAvailablePlaceAfterRegistering, actualNumberOfAvailablePlaceAfterRegistering);
	}

	@Test
	void register_givenParticipantWithoutEmployerWithEnoughJazzBudget_whenRegistering_thenNotRegisterIt() {
		// arrange
		final Technozaure testedTechnozaure = new Technozaure();
		final int initialNumberOfPlace = testedTechnozaure.getAvailablePlace();

		// act
		boolean result = testedTechnozaure.register(new Participant("Dylan", null, 2d));

		// assert
		Assertions.assertFalse(result);

		final int expectedNumberOfParticipant = 0;
		final int actualNumberOfParticipant = testedTechnozaure.getParticipants().size();
		Assertions.assertEquals(expectedNumberOfParticipant, actualNumberOfParticipant);

		final int actualNumberOfAvailablePlaceAfterRegistering = testedTechnozaure.getAvailablePlace();
		Assertions.assertEquals(initialNumberOfPlace, actualNumberOfAvailablePlaceAfterRegistering);
	}

	@Test
	void register_test4() {
		Technozaure t = new Technozaure();
		boolean result = t.register(new Participant("Dylan", EEmployer.ZENIKA, 0d));

		Assertions.assertFalse(result);
		Assertions.assertEquals(0, t.getParticipants().size());
		Assertions.assertEquals(80, t.getAvailablePlace());
	}

	@Test
	void register_givenZenikaEmployeeWithoutEnoughJazzBudget_whenRegistering_thenNotRegisterIt() {
		// arrange
		final Technozaure testedTechnozaure = new Technozaure();
		final int initialNumberOfPlace = testedTechnozaure.getAvailablePlace();

		// act
		boolean result = testedTechnozaure.register(new Participant("Dylan", EEmployer.ZENIKA, 0d));

		// assert
		Assertions.assertFalse(result);

		final int expectedNumberOfParticipant = 0;
		final int actualNumberOfParticipant = testedTechnozaure.getParticipants().size();
		Assertions.assertEquals(expectedNumberOfParticipant, actualNumberOfParticipant);

		final int actualNumberOfAvailablePlaceAfterRegistering = testedTechnozaure.getAvailablePlace();
		Assertions.assertEquals(initialNumberOfPlace, actualNumberOfAvailablePlaceAfterRegistering);
	}

}