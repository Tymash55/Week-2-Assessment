import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GeometryTest {
		private Geometry g;
		@Before
		public void setUp() throws Exception {
			g = new Geometry();
		}

		@Test
		public void testMultiplyZero() {
			assertFalse(g.SquareRoot(49)==7);
		}
	


	}

