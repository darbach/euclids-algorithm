package edu.cnm.deepdive;

/**
 * Use Euclid's Algorithm to find the Greatest Common Divisor.
 */
public class EuclidsAlgorithm {

  /**
   * Find the Greatest Common Divisor for int's a and b. Must be a positive counting integer. If
   * either number is not a natural counting integer (1 or greater) returns -1.
   * @param a first int
   * @param b second int
   * @return Greatest common divisor for a and b
   */
  public int getGCD(int a, int b) {
    //  1. Given two numbers, a and b, where:
    //     * a is a natural counting number
    //     * b is a natural counting number
    if ((a > 0) && (b > 0)) {
      //  2. Define new variables a' and b', with:
      //     * a' = a
      //     * b' = b
      int aPrime = a;
      int bPrime = b;

      //  3. While (b' != 0):
      //     * If (a' > b'), then:
      //        * a' = (a' – b')
      //       Otherwise:
      //        * b' = (b' – a')
      while (bPrime != 0) {
        if (aPrime > bPrime) {
          aPrime = aPrime - bPrime;
        } else {
          bPrime = bPrime - aPrime;
        }
      }
      //  4. a' is the GCD of a and b.
      return aPrime;
    } else {
      return -1;
    }
  }

}
