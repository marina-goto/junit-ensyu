package junit.tutorial.ex02.e04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class RangeTest {

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

	@Nested
	class InnerClass1 {
		Range range = new Range(0.0, 0.0);

		@BeforeEach
		void set1() {
			double min = 0.0;
			double max = 10.5;
			range = new Range(min, max);
		}

		@Test
		void test1() {
			boolean answer = range.contains(-0.1);
			assertEquals(false, answer);
		}

		@Test
		void test2() {
			boolean answer = range.contains(0.0);
			assertEquals(true, answer);
		}

		@Test
		void test3() {
			boolean answer = range.contains(10.5);
			assertEquals(true, answer);
		}

		@Test
		void test4() {
			boolean answer = range.contains(10.6);
			assertEquals(false, answer);
		}

	}@Nested
	class InnerClass2 {
		Range range = new Range(0.0, 0.0);

		@BeforeEach
		void set1() {
			double min = -5.1;
			double max = 5.1;
			range = new Range(min, max);
		}

		@Test
		void test1() {
			boolean answer = range.contains(-5.2);
			assertEquals(false, answer);
		}

		@Test
		void test2() {
			boolean answer = range.contains(-5.1);
			assertEquals(true, answer);
		}

		@Test
		void test3() {
			boolean answer = range.contains(5.1);
			assertEquals(true, answer);
		}

		@Test
		void test4() {
			boolean answer = range.contains(5.2);
			assertEquals(false, answer);
		}

	}
}
