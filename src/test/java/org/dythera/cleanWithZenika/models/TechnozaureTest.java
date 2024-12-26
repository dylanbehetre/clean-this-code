package org.dythera.cleanWithZenika.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class TechnozaureTest {

	@Nested
	@DisplayName("register")
	class registerTest {

		@Test
		void givenZenikaEmployeeWithEnoughJazzBudget_whenRegistering_thenIsRegistered() throws NoPoolPlaceException {
			// arrange
			final Technozaure tested = new Technozaure();
			final Participant participantToRegister = new Participant("Dylan", EEmployer.ZENIKA, 2);

			// act
			tested.register(participantToRegister);

			// assert
			final int expectedParticipantsNumber = 1;
			Assertions.assertEquals(expectedParticipantsNumber, tested.getRegisteredParticipants().size());
		}

		@Test
		void register_test4() throws NoPoolPlaceException {
			Technozaure technozaure = new Technozaure();
			technozaure.register(new Participant("Dylan", EEmployer.ZENIKA, 0));

			Assertions.assertEquals(0, technozaure.getRegisteredParticipants().size());
		}
	}

}
