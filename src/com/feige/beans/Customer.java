package com.feige.beans;

public class Customer extends Person {
    private String customerId;
    private String phone;
    public Customer() {
    }

    public Customer(String customerId, String phone) {
        super(); // 调用父类构造方法，可写可不写
        this.customerId = customerId;
        this.phone = phone;
    }

    public Customer(String name, String sex, String pwd, int age, String customerId, String phone) {
        super(name, sex, pwd, age);
        this.customerId = customerId;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
