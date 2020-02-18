package epam.CleanCode_Task4;


import static org.junit.Assert.*;

import org.junit.Test;

import epam.CleanCode_Task4.SimpleInterest;

public class SimpleInterestTest {

	@Test
	public void test() {
		SimpleInterest s=new SimpleInterest();
		assertEquals(Double.valueOf(200.0),s.calculate_simpleinterest(1000.0,5.0,4.0));
		
	}

}