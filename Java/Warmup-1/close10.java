// Completed on January 2nd, 2019

// Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.

// close10(8, 13) → 8
// close10(13, 8) → 8
// close10(13, 7) → 0

public int close10(int a, int b) {
  int value1;
  int value2;

  value1 = Math.abs(10 - a);
  value2 = Math.abs(10 - b);

  if (value1 < value2){
      return a;
  }
  else if (value2 < value1) {
      return b;
  }
  return 0;
  
}
