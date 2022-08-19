import java.util.Random;

class LinearSearching {
  public static void main(String[] args) {
    int num[] = LinearSearching.addElements();
    System.out.println("The highest number is: " + LinearSearching.MAX(num));
  }

  public static int[] addElements() {
    int num[] = new int[Integer.MAX_VALUE / 5];
    // import java. util. Random; ——>add this to import statement
    Random rnd = new Random();
    int val = 0;
    for (int i = 0; i < num.length; i++) {
      val = rnd.nextInt(num.length - 1) + 1;
      num[i] = val;
    } // end of for
    return num;
  }// end of addElments

  public static int MAX(int num[]) {// end
    int highest = num[0];
    for (int i = 0; i < num.length; i++) {
      if (num[i] > highest) {
        highest = num[i];
      }
    }
    long start = System.nanoTime();
    for (int i = Integer.MAX_VALUE/6; i < num.length; i++) {
      if (num[i] == (Integer.MAX_VALUE /5)) {
        break;
      }
    }
    long end = System.nanoTime();
    System.out.println("The time taken to search is: " + (end - start) + " nanoseconds");
    return highest;
  }// end of highest
}// end of class
