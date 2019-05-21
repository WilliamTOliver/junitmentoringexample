/*
 * Copyright 2015-2018 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UserTests {

	@Test
	@DisplayName("Initialization")
	void initializeUser() {
		String testName = "Trevor";
		User user = new User(testName);
		assertEquals(testName, user.getName(), "getName should fetch initialized user's name");
	}
	@Test
	@DisplayName("User.setName")
	void setName() {
		String initialName = "Trevor";
		String newName = "Lauren";
		User user = new User(initialName);
		user.setName(newName);
		assertEquals(newName, user.getName(), "getName should fetch newly set name");
	}
}
