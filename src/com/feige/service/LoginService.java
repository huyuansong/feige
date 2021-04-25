package com.feige.service;

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
        }else {
            System.out.println("快递员登录");
        }

    }
}
