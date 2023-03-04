package com.cjava;

import com.cjava.dao.PersonDao;
import com.cjava.dao.PersonDaoImpl;
import com.cjava.model.Person;

import java.time.LocalDate;
import java.util.List;

public class AnotherMainApp {

  public static void main(String[] args) {
    PersonDao personDao = new PersonDaoImpl();

    Person newPerson = new Person(5,"Edward");

    Boolean result = personDao.savePerson(newPerson);

    System.out.println(result);
    
    List<Person> persons = personDao.getAllPersons();

    persons.forEach(p -> System.out.println("Person id: " + p.id() + " Person name:" + p.name()));

    System.out.println("Prueba Git");

    System.out.println("Test Git - feature/new_feature");

    System.out.println(LocalDate.now());

  }
  
}
