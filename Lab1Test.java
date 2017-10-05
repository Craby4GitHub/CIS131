import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Lab1Test {

	private Lab1 classUnderTest;
	@Before
	public void setUp() throws Exception {
		classUnderTest = new Lab1();
	}

	@Test
	public void testGetDay() {
		String dayOne = "mon";
		
		assertEquals(dayOne, classUnderTest.getDay("mon"));
		
	}

}
