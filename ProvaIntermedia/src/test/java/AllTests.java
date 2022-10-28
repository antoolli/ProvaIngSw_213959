import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ProvaIntermediaTest.SelectionSortText;
import ProvaIntermediaTest.binarySerchTest;
import ProvaIntermediaTest.stringToIntConverterTest;

@RunWith(Suite.class)
@SuiteClasses({stringToIntConverterTest.class, binarySerchTest.class, SelectionSortText.class})
public class AllTests {

}
