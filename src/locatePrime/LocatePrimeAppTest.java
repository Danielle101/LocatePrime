package locatePrime;

import static org.junit.Assert.*;

import org.junit.Test;

public class LocatePrimeAppTest {

	
		@Test
		public void test1() {
			assertEquals(true,LocatePrimeApp.isPrime(5));
		}
		@Test
		public void test2() {
			assertEquals(false,LocatePrimeApp.isPrime(8));
		}
		@Test
		public void test3() {
			assertEquals(false,LocatePrimeApp.isPrime(10));
		}
		@Test
		public void test4() {
			assertEquals(false,LocatePrimeApp.isPrime(12));
		}
		@Test
		public void test5() {
			assertEquals(true,LocatePrimeApp.isPrime(47));
		}
		@Test
		public void test6() {
			assertEquals(true,LocatePrimeApp.isPrime(23));
		}		
		@Test
		public void test7() {
			assertEquals(true,LocatePrimeApp.isPrime(101));
		}
		@Test
		public void test8() {
			assertEquals(31,LocatePrimeApp.getPrime(14));
		}
		@Test
		public void test9() {
			assertEquals(113,LocatePrimeApp.getPrime(34));
		}
		@Test
		public void test10() {
			assertEquals(257,LocatePrimeApp.getPrime(61));
		}

	}


