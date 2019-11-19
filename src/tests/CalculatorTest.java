package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import main.Calculator;

public class CalculatorTest {
	
	Calculator cacl;
	
	@Before
	public void init()
	{
		cacl = new Calculator();
	}
	
	@Test
	public void testAdd()
	{
		long result = cacl.add(6, 12);
		
		assertEquals(18, result);
	}
	
	@Test
	public void testSub()
	{
		long result = cacl.substract(6, 12);
		
		assertEquals(-6, result);
	}

}
