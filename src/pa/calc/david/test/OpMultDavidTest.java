package pa.calc.david.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import pa.calc.david.OpMultDavid;

//@RunWith(JUnitPlatform.class)
public class OpMultDavidTest {

//	@BeforeAll
//	public void initAll() {
//		System.out.println("@BeforeAll - Runbefore all methods once");
//	}
//	
//	@BeforeEach
//	public void init() {
//		System.out.println("@BeforeAll - Runbefore all methods once");
//	}	
	
	//@DisplayName("Teste da classe OpMultDavid")
	@Test
	void testMethod1() {

		OpMultDavid op = new OpMultDavid();
		
		
		double expected = 10.0;
		double result = op.oper(5, 2);
		
		assertEquals(expected, result, 0);
		
	}
	
}
