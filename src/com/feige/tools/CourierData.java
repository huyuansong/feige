package com.feige.tools;

import com.feige.beans.Courier;

import java.util.Arrays;

public class CourierData {
    private static int SIZE = 10;
    private static int COUNT = 0;
    private static Courier[] COURIERDATA = new Courier[SIZE];

    // 保存用户信息
    public static void save( Courier Courier) {
        // 当使用量count 和数组的最大容量size相等，空间用完了，扩容为原大小的2倍
        if ( COUNT == SIZE ) {
            COURIERDATA = Arrays.copyOf(COURIERDATA , SIZE * 2) ;
            SIZE *= 2 ;
        }
        for (int i = 0; i < COURIERDATA.length; i++) {
            if ( null == COURIERDATA[i] ) {
                COURIERDATA[i] = Courier;
                COUNT++;
            }
        }

    }

    // 查询客户的信息
    public static Courier get (String CourierId ) {
        for( Courier c : COURIERDATA ) {
            if ( CourierId.equals(c.getCourierId() ) ) {
                return c;
            }
        }
        return null;
    }

    // 重载查询方法
    public static Courier get(String CourierId , String pwd ) {
       /* for (int i = 0; i < COURIERDATA.length; i++) {
            if ( CourierId.equals(COURIERDATA[i].getCourierId() ) &&  pwd.equals(COURIERDATA[i].getPwd() ) ) {
                return  COURIERDATA[i];
            }
        }
        return null;*/
        for ( Courier c : COURIERDATA ) {
            if ( CourierId.equals(c.getCourierId()) && pwd.equals(c.getPwd()) ) {
                return c;
            }
        }
        return null;
    }

}
