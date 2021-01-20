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

    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String toString()
    {
        return firstname +" "+lastname+" "+(sex.booleanValue()?"男":"女")+" "+age;
    }
}
