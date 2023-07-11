package com.fundamentals.dao;

import java.util.ArrayList;
import com.fundamentals.entity.Person;

public interface PersonDAO {
  public void create(Person person) throws Exception;
  public ArrayList<Person> read() throws Exception;
  public void update(Person person) throws Exception;
  public void delete(Person person) throws Exception;
}
