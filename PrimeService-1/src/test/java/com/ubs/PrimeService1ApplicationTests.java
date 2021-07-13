package com.ubs;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.ubs.util.Math;
import org.junit.BeforeClass;
import static junit.framework.TestCase.assertEquals;


@SpringBootTest
class PrimeService1ApplicationTests {

	public static Math math ;
	
	@BeforeClass
	public static void instatiate() {
		math = new Math();
	}
	
	
	@Test
	void _01test_prime_number() {
		math = new Math();
		assertEquals(97, math.prime(97));
	}
	
	
	@Test
	void _02test_non_prime_number() {
		math = new Math();
		assertEquals(0, math.prime(81));
	}

	
	@Test
	void _03test_primes_count() {
		math = new Math();
		assertEquals(25, math.evaluatePrime(99).size());
	}
	
	
	
}
