package epam.CleanCode_Task4;

import static org.junit.Assert.*;

import org.junit.Test;

import epam.CleanCode_Task4.SimpleInterest;
import epam.CleanCode_Task4.CompoundInterest;

public class CompoundInterestTest {

	@Test
	public void test() {
		SimpleInterest s=new SimpleInterest();
		assertEquals(Double.valueOf(200.0),s.calculate_simpleinterest(1000.0,5.0,4.0));
		CompoundInterest c=new CompoundInterest();
		assertEquals(Double.valueOf(216.65290240000013),c.calculate_compoundinterest(1000.0,5.0,4.0));
	}

}