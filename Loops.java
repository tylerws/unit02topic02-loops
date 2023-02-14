import java.util.Arrays;

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

  public static int[] getFactors(int numRandoms) {
    int n = numRandoms;
    int count = 1;
    int amount = 0;
    while (count <= n) {
      int remainder = n % count;
      if (remainder == 0) {
        amount++;
      }
      count++;
    }
    int[] factors = new int[amount];
    int count2 = 1;
    int index = 0;
    while (count2 <= n) {
      int remainder = n % count2;
      if (remainder == 0) {
        factors[index] = count2;
        index++;
      }
      count2++;
    }
    return factors;
  }

  private static int rollDie() {
    double roll = Math.random()*6 + 1;
    return (int) roll;
  }
  
  public static void pepysSimulation() {
    
    int countSix = 0;
    int countTwelve = 0;
    int totalIndex = 0;
    
    while (totalIndex <= 1000) {
    
    boolean rolledSixFromSix = false;
    int sixes = 0;
    int sixIndex = 0;
    while (sixIndex <= 6) {
      int rolled = rollDie();
      if (rolled == 1) {
        sixes = sixes + 1;
      }
      if (sixes > 0) {
        rolledSixFromSix = true;
      }
      sixIndex++;
    }
    

    boolean rolledSixFromTwelve = false;
    int sixesTwelve = 0;
    int twelveIndex = 0;
    while (twelveIndex <= 12) {
      int rolled = rollDie();
      if (rolled == 6) {
        sixesTwelve = sixesTwelve + 1;
      }
      if (sixesTwelve >= 2) {
        rolledSixFromTwelve = true;
      }
      twelveIndex++;
    }
    

    if (rolledSixFromSix == true) {
      countSix++;
    }
    if (rolledSixFromTwelve == true) {
      countTwelve++;
    }
    totalIndex++;
    }
    
      System.out.println("Out of 1000 trials, a one was rolled at least once out of six spins " + countSix + " times, and one was rolled at least twice out of twelve spins " + countTwelve + " times.");
      if (countSix > countTwelve) {
        System.out.println("Rolling a one at least once out of six spins was more likely.");
      } else if (countSix < countTwelve) {
        System.out.println("Rolling a one at least twice out of twelve spins was more likely.");
      } else {
        System.out.println("Both methods are equally likely.");
      }
      //I misread the prompt as needing to roll 6 initially, causing some of the variable names to not make sense.
    
}

  public static void main(String[] args) {

    nHellos(22);
    System.out.println(nRandoms(2));
    System.out.println(isPrime(57));
    System.out.println(Arrays.toString(getFactors(24)));
    pepysSimulation();
  }
}