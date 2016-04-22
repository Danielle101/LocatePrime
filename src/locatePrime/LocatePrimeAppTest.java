package locatePrime;

import static org.junit.Assert.*;

import org.junit.Test;

public class LocatePrimeAppTest {

	
		@Test
		public void test1() {
			assertEquals(true,PrimeMethod.isPrime(5));
		}
		@Test
		public void test2() {
			assertEquals(false,PrimeMethod.isPrime(8));
		}
		@Test
		public void test3() {
			assertEquals(false,PrimeMethod.isPrime(10));
		}
		@Test
		public void test4() {
			assertEquals(false,PrimeMethod.isPrime(12));
		}
		@Test
		public void test5() {
			assertEquals(true,PrimeMethod.isPrime(47));
		}
		@Test
		public void test6() {
			assertEquals(true,PrimeMethod.isPrime(23));
		}		@Test
		public void test7() {
			assertEquals(true,PrimeMethod.isPrime(101));
		}
		

	}


