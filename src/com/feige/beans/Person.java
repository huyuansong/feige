package com.feige.beans;
// 实体类  JavaBean 标准类
public class Person {
    private String name;
    private String sex;
    private String pwd;
    private int age;

    public Person() {
    }

    public Person(String name, String sex, String pwd, int age) {
        this.name = name;
        this.sex = sex;
        this.pwd = pwd;
        this.age = age;
    }
    public String toString() {
        return "[" +this.name +"," + this.sex +"," + this.pwd + "," + this.age +"]";
    }

    // 封装 setter
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



}
