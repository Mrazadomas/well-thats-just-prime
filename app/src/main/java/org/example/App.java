package org.example;

import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Factorizer number = new Factorizer();
    ArrayList<Integer> prime = number.primeFactors(17);
    for (int i = 0; i < prime.size(); i++) {
        System.out.println(prime.get(i));
    }
  }
}
