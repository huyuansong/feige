package com.feige.tools;

import com.feige.beans.Order;

import java.util.Arrays;

public class OrderData {
    private static int SIZE = 10;
    private static int COUNT = 0;
    private static Order[] ORDERDATA = new Order[SIZE];

    // 保存用户信息
    public static void save( Order order) {
        // 当使用量count 和数组的最大容量size相等，空间用完了，扩容为原大小的2倍
        if ( COUNT == SIZE ) {
            ORDERDATA = Arrays.copyOf(ORDERDATA , SIZE * 2) ;
            SIZE *= 2 ;
        }
        for (int i = 0; i < ORDERDATA.length; i++) {
            if ( null == ORDERDATA[i] ) {
                ORDERDATA[i] = order;
                COUNT++;
            }
        }

    }

    // 查询客户的信息
    public static Order get (String OrderId ) {
        for( Order c : ORDERDATA ) {
            if ( OrderId.equals(c.getOrderId() ) ) {
                return c;
            }
        }
        return null;
    }

    // 重载查询方法
    public static Order get(String orderId , String pwd ) {
       /* for (int i = 0; i < ORDERDATA.length; i++) {
            if ( CourierId.equals(ORDERDATA[i].getCourierId() ) &&  pwd.equals(ORDERDATA[i].getPwd() ) ) {
                return  ORDERDATA[i];
            }
        }
        return null;*/
        for ( Order c : ORDERDATA ) {
            if ( orderId.equals(c.getOrderId()) ) {
                return c;
            }
        }
        return null;
    }

}
