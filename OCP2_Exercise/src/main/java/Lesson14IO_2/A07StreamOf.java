package Lesson14IO_2;

import java.util.stream.Stream;

/**
 *
 * @author oracle
 */
public class A07StreamOf {
  public static void main(String[] args) {
        
    Stream.of("Monday", "Tuesday","Wedensday", "Thursday")
      .filter(s -> s.startsWith("T"))
      .forEach(s -> System.out.println("Matching Days: " + s));
  }
}
