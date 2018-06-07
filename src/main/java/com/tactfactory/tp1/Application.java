/*******************************************************************************
 * copyright
 ******************************************************************************/
package com.tactfactory.tp1;

import org.joda.time.DateTime;

/**
 * My main Application
 * @author Julien
 */
public class Application {
	/**
	 * Enter point application.
	 * @param args Argument from CLI.
	 */
	public static void main(String[] args) {
		System.out.println("Hello world");
		DateTime date = DateTime.now();
	}
	
	/**
	 * Add method.
	 * 
	 * @param i first value.
	 * @param j second value.
	 * @return result of the addition.
	 */
	public static int add(int i, int j)
	{
		return i + j;
	}
	
}
	
