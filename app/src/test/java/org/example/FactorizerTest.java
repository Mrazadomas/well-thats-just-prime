package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;

class FactorizerTest {
  @Test
  void itReturnsAnEmptyListForZero() {
    Factorizer factorizer = new Factorizer();
    assertEquals(factorizer.primeFactors(0), new ArrayList<Integer>());
    assertEquals(factorizer.primeFactors(100), new ArrayList<Integer>(Arrays.asList(2,2,5,5)));
    assertEquals(factorizer.primeFactors(17), new ArrayList<Integer>());
    assertEquals(factorizer.primeFactors(9), new ArrayList<Integer>(Arrays.asList(3, 3)));
    assertEquals(factorizer.isPrime(36), false);
    assertEquals(factorizer.isPrime(12), false);
    assertEquals(factorizer.isPrime(17), true);
    assertEquals(factorizer.isPrime(1), false);
    assertEquals(factorizer.isPrime(0), false);
  }
}
