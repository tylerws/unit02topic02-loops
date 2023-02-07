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

  public static void main(String[] args) {

    nHellos(22);

  }
}