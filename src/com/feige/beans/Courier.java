package com.feige.beans;

public class Courier extends  Person{
    private String courierId;

    // getter & setter
    public String getCourierId() {
        return courierId;
    }

    public void setCourierId(String courierId) {
        this.courierId = courierId;
    }

    // Constructor 构造方法
    public Courier() {
    }

    public Courier(String courierId) {
        this.courierId = courierId;
    }

    public Courier(String name, String sex, String pwd, int age, String courierId) {
        super(name, sex, pwd, age);
        this.courierId = courierId;
    }

    // toString
    @Override
    public String toString() {
        return "Courier{" +
                "courierId='" + courierId + '\'' +
                "name='" + getName() + '\'' +
                "age='" + getAge() + '\'' +
                "sex='" + getSex() + '\'' +
                "pwd='" + getPwd() + '\'' +
                '}';
    }
}
