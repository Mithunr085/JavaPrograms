package coding;

import java.util.Scanner;
import java.util.stream.Collectors;

public class SpaceString {
    @FunctionalInterface
    interface Sayable {
        public String insertSpace(String s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        Sayable s1 = str -> str.codePoints().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining(" "));
        System.out.println(s1.insertSpace(inputString));
    }
}

/*
 without using imports-------------------
 interface StringSpace {
    String addSpace(String s);
}

public class Source {
    public static void main(String[] args) {
        StringSpace s = str -> String.join(" ", str.split(""));

        System.out.println(s.addSpace("capgemini"));
    }
}
 */

/*
  implementation using only lamda function without Stream API & simple method
  package coding;

import java.util.*;

public class SpaceString {
  @FunctionalInterface
  interface Sayable {
      public String insertSpace(String s);
  }

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String inputString = sc.nextLine();
      Sayable s1 = str -> str.replaceAll("", " ").trim();
      System.out.println(s1.insertSpace(inputString));
  }
}
 */
