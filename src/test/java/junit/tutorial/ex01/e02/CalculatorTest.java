package junit.tutorial.ex01.e02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testDivide() {
		Calculator cal = new Calculator();
		int answer = cal.divide(2, 1);
		assertEquals(2, answer, "違う");
	}

	@Test
	void testDivide2() {
		Calculator cal = new Calculator();
		try {
			int answer = cal.divide(2, 0);
			fail();
		} catch (IllegalArgumentException e) {
		}
	}
}
