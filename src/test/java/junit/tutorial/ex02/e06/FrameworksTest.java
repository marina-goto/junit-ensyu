package junit.tutorial.ex02.e06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Nested;

class FrameworksTest {

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

	@org.junit.jupiter.api.Nested
	class GlassFishClass {
		ApplicationServer apli = ApplicationServer.GlassFish;

		@Test
		void test1() {
			Database db = Database.Oracle;
			boolean answer = Frameworks.isSupport(apli, db);
			assertEquals(true, answer);
		}

		@Test
		void test2() {
			Database db = Database.DB2;
			boolean answer = Frameworks.isSupport(apli, db);
			assertEquals(true, answer);
		}

		@Test
		void test3() {
			Database db = Database.PostgreSQL;
			boolean answer = Frameworks.isSupport(apli, db);
			assertEquals(true, answer);
		}
		@Test
		void test4() {
			Database db = Database.MySQL;
			boolean answer = Frameworks.isSupport(apli, db);
			assertEquals(true, answer);
		}
	}
	@org.junit.jupiter.api.Nested
	class JBossClass {
		ApplicationServer apli = ApplicationServer.JBoss;

		@Test
		void test1() {
			Database db = Database.Oracle;
			boolean answer = Frameworks.isSupport(apli, db);
			assertEquals(false, answer);
		}

		@Test
		void test2() {
			Database db = Database.DB2;
			boolean answer = Frameworks.isSupport(apli, db);
			assertEquals(true, answer);
		}

		@Test
		void test3() {
			Database db = Database.PostgreSQL;
			boolean answer = Frameworks.isSupport(apli, db);
			assertEquals(true, answer);
		}
		@Test
		void test4() {
			Database db = Database.MySQL;
			boolean answer = Frameworks.isSupport(apli, db);
			assertEquals(false, answer);
		}
	}
	@org.junit.jupiter.api.Nested
	class TomcatClass {
		ApplicationServer apli = ApplicationServer.Tomcat;

		@Test
		void test1() {
			Database db = Database.Oracle;
			boolean answer = Frameworks.isSupport(apli, db);
			assertEquals(false, answer);
		}

		@Test
		void test2() {
			Database db = Database.DB2;
			boolean answer = Frameworks.isSupport(apli, db);
			assertEquals(false, answer);
		}

		@Test
		void test3() {
			Database db = Database.PostgreSQL;
			boolean answer = Frameworks.isSupport(apli, db);
			assertEquals(false, answer);
		}
		@Test
		void test4() {
			Database db = Database.MySQL;
			boolean answer = Frameworks.isSupport(apli, db);
			assertEquals(true, answer);
		}
	}
}

//	@ParameterizedTest
//	@CsvSource({
//		"ApplicationServer.GlassFish,Database.Oracle,true",
//		"ApplicationServer.GlassFish,Database.DB2,true",
//		"ApplicationServer.GlassFish,Database.PostgreSQL,true",
//		"ApplicationServer.GlassFish,Database.MySQL,true",
//		
//		"ApplicationServer.Tomcat,Database.Oracle,false",
//		"ApplicationServer.Tomcat,Database.DB2,true",
//		"ApplicationServer.Tomcat,Database.PostgreSQL,true",
//		"ApplicationServer.Tomcat,Database.MySQL,false",
//		
//		"ApplicationServer.JBoss,Database.Oracle,false",
//		"ApplicationServer.JBoss,Database.DB2,false",
//		"ApplicationServer.JBoss,Database.PostgreSQL,false",
//		"ApplicationServer.JBoss,Database.MySQL,true",	
//	})
//	void test(ApplicationServer appServer, Database db,boolean result) {
//		boolean answer=Frameworks.isSupport(appServer, db);
//		
//		assertEquals(result, answer);
//	}
//}
