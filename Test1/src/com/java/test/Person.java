package com.java.test;

/**
 * @Author: liam
 * @Date: 2021/1/20 11:57
 */
public class Person {
    String firstname,lastname;
    Boolean sex;
    Integer age;

    public Person(String firstname, String lastname, Boolean sex, Integer age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.sex = sex;
        this.age = age;
    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public Boolean getSex() {
        return sex;
    }

    public Integer getAge() {
        return age;
    }

    public String toString()
    {
        return firstname +" "+lastname+" "+(sex ?"男":"女")+" "+age;
    }
}
