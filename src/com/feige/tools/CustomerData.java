package com.feige.tools;

import com.feige.beans.Customer;

import java.util.Arrays;

public class CustomerData {
    private static int SIZE = 10;
    private static int COUNT = 0;
    private static Customer[] CUSTOMERDATA = new Customer[SIZE];

    // 保存用户信息
    public static void save( Customer customer) {
        // 当使用量count 和数组的最大容量size相等，空间用完了，扩容为原大小的2倍
        if ( COUNT == SIZE ) {
            CUSTOMERDATA = Arrays.copyOf(CUSTOMERDATA , SIZE * 2) ;
            SIZE *= 2 ;
        }
        for (int i = 0; i < CUSTOMERDATA.length; i++) {
            if ( null == CUSTOMERDATA[i] ) {
                CUSTOMERDATA[i] = customer;
                COUNT++;
                System.out.println("保存成功");
                break;
            }
        }

    }

    // 查询客户的信息
    public static Customer get (String customerId ) {
        for( Customer c : CUSTOMERDATA ) {
            if ( customerId.equals(c.getCustomerId() ) ) {
                return c;
            }
        }
        return null;
    }

    // 重载查询方法
    public static Customer get(String customerId , String pwd ) {
       /* for (int i = 0; i < CUSTOMERDATA.length; i++) {
            if ( customerId.equals(CUSTOMERDATA[i].getCustomerId() ) &&  pwd.equals(CUSTOMERDATA[i].getPwd() ) ) {
                return  CUSTOMERDATA[i];
            }
        }
        return null;*/
        for ( Customer c : CUSTOMERDATA ) {
            if ( c != null ) {
                if ( c.getCustomerId().equals(customerId) && pwd.equals(c.getPwd()) ) {
                    return c;
                }
            }

        }
        return null;
    }

}
