package com.fundamentals;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      while (true) {
        System.out.println("Please insert the number of one option:");
        System.out.println("[1] Create person [2] List people [3] Update person [4] Delete person [5] Exit");
        int option = Integer.parseInt(scanner.nextLine());

        if (option == 1) {
          throw new UnsupportedOperationException("Unimplemented option '1'");
        }

        if (option == 2) {
          throw new UnsupportedOperationException("Unimplemented option '2'");
        }

        if (option == 3) {
          throw new UnsupportedOperationException("Unimplemented option '3'");
        }

        if (option == 4) {
          throw new UnsupportedOperationException("Unimplemented option '4'");
        }

        if (option == 5) {
          break;
        }
      }
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }
  }
}
