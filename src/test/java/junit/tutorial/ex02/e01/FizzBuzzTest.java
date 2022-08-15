package junit.tutorial.ex02.e01;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

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
	void testCreateFizzBuzzList() {
		FizzBuzz fizzBuzz=new FizzBuzz();
		List<String>answer=fizzBuzz.createFizzBuzzList(16);
		List<String>test=new ArrayList<>();
		test.add("1");
		test.add("2");
		test.add("Fizz");
		test.add("4");
		test.add("Buzz");
		test.add("Fizz");
		test.add("7");
		test.add("8");
		test.add("Fizz");
		test.add("Buzz");
		test.add("11");
		test.add("Fizz");
		test.add("13");
		test.add("14");
		test.add("FizzBuzz");
		test.add("16");
		
		assertIterableEquals(test,answer,"違うよ");
	}

}
