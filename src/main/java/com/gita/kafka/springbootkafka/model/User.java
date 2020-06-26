package com.gita.kafka.springbootkafka.model;

public class User {
  public User(String name, int age) {
    this.name = name;
    this.age = age;
  }

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  private  int age;
}
