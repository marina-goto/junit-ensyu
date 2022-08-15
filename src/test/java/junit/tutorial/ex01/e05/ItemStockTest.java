package junit.tutorial.ex01.e05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.tutorial.ex01.e04.NumberUtils;

class ItemStockTest {

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
	void testGetNum1() {
		ItemStock itemStock = new ItemStock();
		int answer = itemStock.getNum(new Item("book", 100));
		assertEquals(0, answer, "違うよ");
	}

	@Test
	void testGetNum2() {
		Item item = new Item("book", 100);
		ItemStock itemStock = new ItemStock();
		itemStock.add(item);
		int answer = itemStock.getNum(item);
		assertEquals(1, answer, "違うよ");
	}

	void add1() {
		Item item = new Item("book", 100);
		ItemStock itemStock = new ItemStock();
		itemStock.add(item);
	}

	@Test
	void testGetNum3() {
	}

	@Test
	void testGetNum4() {
		Item item = new Item("book", 100);
		ItemStock itemStock = new ItemStock();
		itemStock.add(item);
		itemStock.add(item);
		int answer = itemStock.getNum(item);
		assertEquals(2, answer, "違うよ");
	}

	@Test
	void testGetNum5() {
		Item item = new Item("book", 100);
		ItemStock itemStock = new ItemStock();
		itemStock.add(item);
		Item cd = new Item("CD", 1000);
		itemStock.add(cd);
		int answer = itemStock.getNum(item);
		assertEquals(1, answer, "違うよ");
	}
}
