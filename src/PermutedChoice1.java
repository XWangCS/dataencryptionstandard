package edu.okstate.cs.des;

public class PermutedChoice1 extends LookupTable {
  static public int[] pc1 = {
    57, 49, 41, 33, 25, 17, 9,
     1, 59, 50, 42, 34, 26, 18,
    10,  2, 59, 51, 43, 35, 27,
    19, 11,  3, 60, 52, 44, 36,
  
    63, 55, 47, 39, 31, 23, 15,
     7, 62, 54, 46, 38, 30, 22,
    14,  6, 61, 53, 45, 37, 29,
    21, 13,  5, 28, 20, 12,  4
  };
  
  public static int[] call(int[] r) {
    return applyLookup(r, pc1);
  }
}