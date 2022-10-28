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
	
	

}
