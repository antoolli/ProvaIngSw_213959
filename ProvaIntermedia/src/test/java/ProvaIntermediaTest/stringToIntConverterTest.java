package ProvaIntermediaTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import ProvaIntermedia.FunnyAlgorithms;

public class stringToIntConverterTest {
	private  FunnyAlgorithms funny;
	
	@Before
	public void init() {
		funny= new FunnyAlgorithms();
	}
	
	@Test
	public  void stringToIntConvert() {
		init();
		assertEquals(50, funny.stringToIntConverter("50"));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void stringIllegalArgumentMax() {
		
		funny.stringToIntConverter("32768");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void stringIllegalArgumentMin() {
		
		funny.stringToIntConverter("-32769");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void stringIllegalArgument() {
		
		funny.stringToIntConverter("32 ");
	}
	
	

}
