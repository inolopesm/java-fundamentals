package com.fundamentals.entity;

import java.util.Calendar;
import java.util.TimeZone;

public class Person {
  private String id;
  private String firstName;
  private String lastName;
  private int yearOfBirth;

  public Person(String firstName, String lastName, int yearOfBirth) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.yearOfBirth = yearOfBirth;
  }

  public Person(String id, String firstName, String lastName, int yearOfBirth) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.yearOfBirth = yearOfBirth;
  }

  public String getId() { return this.id; }
  public void setId(String id) { this.id = id; }
  public String getFirstName() { return this.firstName; }
  public void setFirstName(String firstName) { this.firstName = firstName; }
  public String getLastName() { return this.lastName; }
  public void setLastName(String lastName) { this.lastName = lastName; }
  public int getYearOfBirth() { return this.yearOfBirth; }
  public void setYearOfBirth(int yearOfBirth) { this.yearOfBirth = yearOfBirth; }

  public int getAge() {
    TimeZone timeZone = TimeZone.getTimeZone("GMT-3:00");
    Calendar calendar = Calendar.getInstance(timeZone);
    int currentYear = calendar.get(Calendar.YEAR) - 1900;
    return currentYear - this.yearOfBirth;
  }

  public String getFullName() {
    return this.firstName + " " + this.lastName;
  }
}
