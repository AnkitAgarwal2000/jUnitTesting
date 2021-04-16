package jUnitTestingExamplePackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitTesting jUnit= new jUnitTesting();
		String result=jUnit.addStrings("Software ", "Engineering");
		assertEquals("Software Engineering",result);
	}

}
