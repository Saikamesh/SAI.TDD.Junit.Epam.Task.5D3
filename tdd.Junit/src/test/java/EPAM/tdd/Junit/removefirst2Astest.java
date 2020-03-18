package EPAM.tdd.Junit;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class removefirst2Astest {
/*
 * Remove ‘A’ if it is present in first 2 characters of the string.
 * if ‘A’ is present after 2 characters, it should not be 
 * removed.
 *
 * To-Do List: 
 * 1. "ABCD"--> "BCD"	==> Successful  
 * 2. "AACD"--> "CD"	==> Successful
 * 3. "BACD"--> "BCD"	==> Successful
 * 4. "BBAA"--> "BBAA"	==> Successful
 * 5. "AABAA"-->"BAA"	==> Successful
 * 6. "AA"--> "" 		==> Successful
 * 7. "A"--> ""  		==> Successful
 * 8. ""-->""			==> Successful
 */ 
	removefirst2As removeAs; 
	@BeforeEach
	void init() {
		removeAs=new removefirst2As();
	}
	@Test
	void test1() {
		assertEquals("BCD",removeAs.removeAs("ABCD"));
	}
	@Test
	void test2() {
		assertEquals("CD",removeAs.removeAs("AACD"));
	}
	@Test
	void test3() {
		assertEquals("BCD",removeAs.removeAs("BACD"));
	}
	@Test
	void test4() {
		assertEquals("BBAA",removeAs.removeAs("BBAA"));
	}
	@Test
	void test5() {
		assertEquals("BAA",removeAs.removeAs("AABAA"));
	}
	@Test
	void test6() {
		assertEquals("",removeAs.removeAs("AA"));
	}
	@Test
	void test7() {
		assertEquals("",removeAs.removeAs("A"));
	}
	@Test
	void test8() {
		assertEquals("",removeAs.removeAs(""));
	}
}
