package epam.CleanCode_Task4;


import static org.junit.Assert.*;

import org.junit.Test;

import epam.CleanCode_Task4.GenerateBill;

public class GenerateBillTest {

	@Test
	public void testCost() {
		GenerateBill test= new GenerateBill();
		assertEquals(3600.00,test.totalcost("standard material", 3),0);
	}
	@Test
	public void testCost1() {
		GenerateBill test= new GenerateBill();
		assertEquals(6000.00,test.totalcost("Abovestandard material", 4),0);
	}
	@Test
	public void testCost2() {
		GenerateBill test= new GenerateBill();
		assertEquals(3600.00,test.totalcost("Highstandard material", 2),0);
	}
	@Test
	public void testCost3() {
		GenerateBill test= new GenerateBill();
		assertEquals(10000.00,test.totalcost("HighstandardFullautomatic", 4),0);

}
}