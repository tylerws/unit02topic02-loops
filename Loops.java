public class Loops {

  // static methods go here

  public static void nHellos(int n) {
    int count = 1;
    while (n > 0) {
      if (count % 10 == 1 && count % 100 != 11) {
        System.out.println(count + "st hello");
      } else if (count % 10 == 2 && count % 100 != 12) {
        System.out.println(count + "nd hello");
      } else if (count % 10 == 3 && count % 100 != 13) {
        System.out.println(count + "rd hello");
      } else {
        System.out.println(count + "th hello");
      }

      n--;
      count++;
    }
  }

  public static double nRandoms(int numRandoms) {
    int n = numRandoms;
    double randTotal = 0;
    int value = n;
    while (n > 0) {
      double randVal = Math.random();
      System.out.println(randVal);
      randTotal = randTotal + randVal;
      n--;
    }
    return (randTotal / value);
  }

  public static boolean isPrime(int numRandoms) {
    int n = numRandoms;
    int count = 2;
    while (count <= n) {
      int remainder = n % count;
      if (remainder == 0 && count != n) {
        return false;
      }
      count ++;
    }
    return true;
  }

  public static void main(String[] args) {

    //nHellos(22);
    //System.out.println(nRandoms(2));
    System.out.println(isPrime(57));
  }
}