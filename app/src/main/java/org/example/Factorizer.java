package org.example;

import java.util.ArrayList;

public class Factorizer {
  public ArrayList<Integer> primeFactors(Integer n) {
    int x = n;
    int i;
    ArrayList<Integer> nums = new ArrayList<>();
    for (i = 2; i <= x; i++) {
        if ((x % i) == 0) {
            if ((i != n)) {
                x = x / i;
                nums.add(i);
                i = 1;
            }
        }
    }
    return nums;
  }

  public boolean isPrime(Integer n) {
    int x = n;
    int i;
    ArrayList<Integer> nums = new ArrayList<>();
    for (i = 2; i <= x; i++) {
        if ((x % i) == 0) {
            if ((i != n)) {
                x = x / i;
                nums.add(i);
                i = 1;
            }
        }
    }
    if ((nums.size() == 0) && (n > 1)) {
        return true;
    } else {
        return false;
    }
  }
}
