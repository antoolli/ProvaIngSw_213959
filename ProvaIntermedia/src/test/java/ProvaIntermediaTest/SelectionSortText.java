package ProvaIntermediaTest;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;
import ProvaIntermedia.FunnyAlgorithms;

public class SelectionSortText {
	

	private FunnyAlgorithms funny;
	
	@Before
	public void init() {
		funny= new FunnyAlgorithms();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testParamOrderMax() {
		int order=2;
		funny.selectionSort(null, order);
	}
	
	@Test
	public void testCondition() {
		int array[]= {0,0,0,1,1};
	}
	
}
