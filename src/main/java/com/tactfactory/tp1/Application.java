/*******************************************************************************
 * copyright
 ******************************************************************************/
package com.tactfactory.tp1;

import org.joda.time.DateTime;

/**
 * My main Application.
 * @author Julien
 */
public final class Application {
	
	private Application() {
		
	}
	/**
	 * Enter point application.
	 * @param args Argument from CLI.
	 */
	public static void main(final String[] args) {
		final DateTime date = DateTime.now();
	}
	
	/**
	 * Add method.
	 * 
	 * @param value1 first value.
	 * @param value2 second value.
	 * @return result of the addition.
	 */
	public static int add(final int value1, final int value2) {
		return value1 + value2;
	}
}
