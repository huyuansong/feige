package com.feige.service;

import com.feige.beans.Customer;
import com.feige.tools.CustomerData;

import java.util.Scanner;

public class LoginService {
    private Scanner scanner = null;
    public LoginService() {};
    public LoginService(Scanner scanner) {
        this.scanner = scanner;
    }

    public void login() {
        System.out.println("选择身份：1 用户 2 快递员");
        int role = scanner.nextInt();
        System.out.println("请输入用户的id：");
        String id = scanner.next();
        System.out.println("请输入用户的密码：");
        String pwd = scanner.next();
        if ( 1 == role  ) {
            System.out.println("用户登录");
            invokeCustomerService(id , pwd);
        }else if( 2 == role ){
            System.out.println("快递员登录功能暂时关闭");
        }

    }
    // 登录
    public void invokeCustomerService(String id , String pwd) {
        // 在数组中查询该用户是否存在
        Customer customer = CustomerData.get(id, pwd);
        if ( null == customer ) {
            System.out.println("数据库中没有该用户，无法登录");
            return; // 提前中断程序
        }
        // 找到用户，进入对应的功能
        new CustomerService(scanner, id).menu();

    }

    // 注册   ftp://172.17.40.240
    public void resgister( Scanner sc ) {
        System.out.println("请输入用户的编号：");
        String clientId = sc.next();
        System.out.println("请输入用户的密码：");
        String pwd = sc.next();
        System.out.println("请输入用户名：");
        String name = sc.next();
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        System.out.println("请输入性别：");
        String sex = sc.next();
        System.out.println("请输入用户的手机号：");
        String phone = sc.next();

        Customer customer = new Customer(name , sex, pwd, age, clientId, phone);
        CustomerData.save(customer);

    }

}
