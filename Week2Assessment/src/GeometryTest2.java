import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GeometryTest2 {
	private Geometry g;
	@Before
	public void setUp() throws Exception {
		g = new Geometry();
	}

	@Test
	public void testMultiply() {
		assertEquals(20, g.multiply(4,5));
	}
	
	@Test
	public void testMultiplyZero() {
		assertTrue(g.multiply(0,5)==0);
	}


}
