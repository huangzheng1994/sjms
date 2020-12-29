package com.example.james.test;

import com.example.james.test.utils.DESCoder;
import com.example.james.test.utils.DataUtil;

/**
 * @author hz
 * @date 2020-12-29 17:07
 */
public class Test {

    public static void main(String[] args) {
        String a = "54303030303233363600C8000000009D";
        String b = "0000000000000000";
        byte[] dataBytes = DataUtil.hexStringToBytes(a);
        byte[] keyBytes = DataUtil.hexStringToBytes(b);
        String encrypt = DESCoder.encrypt(dataBytes, keyBytes).toUpperCase();
        System.out.println(encrypt);
        String aa ="8D F6 B1 A2 30 33 18 AC 65 7C 34 70 E0 A4 65 DA";
        String s = aa.replaceAll(" ", "");
        System.out.println(encrypt.equals(s));
    }
}
