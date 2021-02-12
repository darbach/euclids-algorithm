package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EuclidsAlgorithmTest {

  EuclidsAlgorithm euclid = new EuclidsAlgorithm();
  // {a, b, GCD}
  private int[][] testCases = {
      {45, 210, 15},
      {26_187, 1_533, 21},
      {296, 137, 1},
      {30, 150, 30},
      {1_288, 152, 8},
      {220, 1_323, 1},
      {270, 192, 6},
      {-15, 3, -1},
      {15, -3, -1},
      {12, 0, -1},
      {0, 47, -1},
      {0, 0, -1}
  };

  @Test
  void getGCD() {
    for (int i = 0; i < testCases.length; i++) {
      int a = testCases[i][0];  //input
      int b = testCases[i][1]; //
      int expected = testCases[i][2];
      int result = euclid.getGCD(a, b);
      System.out.printf("GCD(%d, %d) = EXPECTED: %d; RESULT: %d%n", a, b, expected, result);
      assertEquals(expected, result);
    }
  }
}