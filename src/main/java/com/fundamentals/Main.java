package com.fundamentals;
import java.util.Scanner;
import com.fundamentals.entity.Person;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {
      System.out.println("Please insert your name:");
      String name = scanner.nextLine();
      System.out.println("Please insert your age:");
      int age = Integer.parseInt(scanner.nextLine());
      Person person = new Person(name, age);
      System.out.println("Hello, " + person.getName() + " with age " + person.age + "!");
    } catch (NumberFormatException e) {
      System.out.println("Ouch! Invalid number");
    } finally {
      scanner.close();
    }
  }
}
