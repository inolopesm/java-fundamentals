package com.fundamentals.entity;

public class Person {
  private String name;
  public final int age;

  public Person(String name, int age) {
    this.setName(name);
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }
}
