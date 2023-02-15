package org.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PasswordDriverTest {

	@Test
	void testPasswordMustFollow() {
		boolean result = PasswordDriver.passwordMustFollow("userSelection");
		Assertions.assertTrue(result);
	}

	@Test
	void testMain() {
		PasswordDriver.main(new String[]{"args"});
	}
}

//PasswordDriverTest generated with TestMe