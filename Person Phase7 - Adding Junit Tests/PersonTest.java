import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PersonTest {
	Person p1,p2,p3;
	@Before
	public void setUp() throws Exception {
		p1 = new Person ();
		p2 = new Person ("Amy",  44, 20);
		p3 = new Person ("Kim");
	}

	@After
	public void tearDown() throws Exception {
		p1= p2 = p3 = null;
	}

	 
	@Test
	public void testPersonString() {
		String p1ToStr,p2ToStr;
		p1ToStr= "The person's name is noname and their age is 1";
		p2ToStr= "The person's name is Amy and their age is 44";
	 
		assertTrue(p1ToStr.equals(p1.toString()));
		assertTrue(p2ToStr.equals(p2.toString()));
	}

 	@Test
	public void testHaveBirthday() {
 		p1.HaveBirthday();
 		p1.HaveBirthday();
 		assertEquals(p1.getAge(), 3);
 		p2.HaveBirthday();
 		assertEquals(p2.getAge(), 45);
	}
 	
 	@Test
	public void testIncreaseWAge() {
 		p1.increaseWage(5);
 	  	assertEquals(p1.getWage(), 10.5,.01);
 		p2.increaseWage(3);
 	  	assertEquals(p2.getWage(), 20.6,.01);
	}

}
