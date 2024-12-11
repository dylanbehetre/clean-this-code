package org.dythera.unclean.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TechnozaureTest {

	@Test
	void add_test1() {
		Technozaure t = new Technozaure();
		boolean result = t.add(new Person("Dylan", "Zenika", 2));

		Assertions.assertTrue(result);
		Assertions.assertEquals(t.getAdded().size(), 1);
		Assertions.assertEquals(t.getCapacity(), 79);
	}

	@Test
	void add_test2() {
		Technozaure t = new Technozaure();
		boolean result = t.add(new Person("Dylan", "Zecret", 2));

		Assertions.assertFalse(result);
		Assertions.assertEquals(t.getAdded().size(), 0);
		Assertions.assertEquals(t.getCapacity(), 80);
	}

	@Test
	void add_test4() {
		Technozaure t = new Technozaure();
		boolean result = t.add(new Person("Dylan", "Zenika", 0));

		Assertions.assertFalse(result);
		Assertions.assertEquals(t.getAdded().size(), 0);
		Assertions.assertEquals(t.getCapacity(), 80);
	}

}