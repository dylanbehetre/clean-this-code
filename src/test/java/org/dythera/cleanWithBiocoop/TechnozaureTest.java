package org.dythera.cleanWithBiocoop;

import org.dythera.unclean.models.Participant;
import org.dythera.unclean.models.Technozaure;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class TechnozaureTest {

	@Nested
	class register {

		@Test
		void givenZenikaEmployeeParticipantWithEnoughJazzBudget_whenRegistering_thenRegisterIt() {
			// arrange
			final Technozaure testedTechnozaure = new Technozaure();
			final int initialNumberOfSlots = testedTechnozaure.getAvailableSlot();
			final int enoughJazzBudget = 2;
			final Participant participantToRegister = new Participant("Dylan", "Zenika", enoughJazzBudget);

			// act
			boolean isParticipantRegistered = testedTechnozaure.register(participantToRegister);

			// assert
			Assertions.assertTrue(isParticipantRegistered);

			final int expectedParticipantNumber = 1;
			Assertions.assertEquals(expectedParticipantNumber, testedTechnozaure.getParticipants().size());
			final int expectedNumberOfAvailableSlots = initialNumberOfSlots - expectedParticipantNumber;
			Assertions.assertEquals(expectedNumberOfAvailableSlots, testedTechnozaure.getAvailableSlot());
		}

		@Test
		void add_test2() {
			Technozaure t = new Technozaure();
			boolean result = t.register(new Participant("Dylan", "Zecret", 2));

			Assertions.assertFalse(result);
			Assertions.assertEquals(t.getParticipants().size(), 0);
			Assertions.assertEquals(t.getAvailableSlot(), 80);
		}

		@Test
		void add_test4() {
			Technozaure t = new Technozaure();
			boolean result = t.register(new Participant("Dylan", "Zenika", 0));

			Assertions.assertFalse(result);
			Assertions.assertEquals(t.getParticipants().size(), 0);
			Assertions.assertEquals(t.getAvailableSlot(), 80);
		}
	}

}