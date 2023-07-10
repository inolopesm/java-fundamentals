package com.fundamentals;
import java.util.Scanner;
import com.fundamentals.entity.Person;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please insert your name:");
    String name = scanner.nextLine();
    Person person = new Person(name);
    System.out.println("Hello, " + person.getName() + "!");
    scanner.close();
  }
}
