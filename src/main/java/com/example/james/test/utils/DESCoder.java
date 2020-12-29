package com.example.james.test.utils;


import com.example.james.test.utils.DataUtil;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.security.Key;

/**
 * @author hz
 * @date 2019-7-17 14:14
 */
public class DESCoder {

    /**
     * 分组加密的四种模式
     * <p>
     * ECB:电码本模式
     * CBC:密文分组链接方式
     * CFB:密文反馈模式
     * OFB:输出反馈模式
     * CTR:计数器模式
     */
    public static final String KEY_ALGORITHM = "DES";


    /**
     * 对于加密，因为DES是块加密，数据长度必须是8的倍数，然而实际上加密前的明文getBytes()后基本不会恰好是8的倍数，
     * 所以一般需要进行填充，填充的规则这里不说，想知道的百度吧，反正这个只需要设置参数 PKCS5Padding ，
     * JDK就帮你填充了，若不填充，且数据长度不是8倍数，则会抛异常
     * <p>
     * PKCS5Padding :
     * ZeroPadding  :
     * PKCS7Padding :
     * NoPadding    :
     */
    public static final String CIPHER_PADDING = "NoPadding";

    /**
     * 算法名称/加密模式/填充方式
     */
    public static final String CIPHER_ALGORITHM_ECB = "DES/ECB/NoPadding";

    public static final String CIPHER_ALGORITHM_ECB_PKCS5PADDING = "DES/ECB/PKCS5Padding";

    /**
     * 生成秘钥
     * 自定义
     */
    public static String generateKey(String randomNum) {
        //随机数+1379得秘钥前4字节
        Long randomNumLong = Long.parseLong(randomNum, 16) + 1379L;
        String key4 = DataUtil.hexString(randomNumLong, 8);
        //后4位由前4位按位取反
//        randomNumLong =~ randomNumLong;
        randomNumLong ^= 0xffffffff;
        String key8 = Long.toHexString(randomNumLong);
        //完整密钥
        return key8.replace("ffffffff", key4).toUpperCase();
    }

    /**
     * 还原密钥
     *
     * @param key
     * @return
     * @throws Exception
     */
    private static Key toKey(byte[] key) throws Exception {
        DESKeySpec des = new DESKeySpec(key);
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(KEY_ALGORITHM);
        return keyFactory.generateSecret(des);
    }

    /**
     * 加密
     *
     * @param data 原文
     * @param key  秘钥
     * @return 密文
     */
    public static String encrypt(byte[] data, byte[] key) {
        try {
            Key secureKey = toKey(key);
            Cipher cipher = Cipher.getInstance(CIPHER_ALGORITHM_ECB);
            cipher.init(Cipher.ENCRYPT_MODE, secureKey);
            return DataUtil.bytesToHexString(cipher.doFinal(data));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 解密
     *
     * @param data 密文
     * @param key
     * @return 明文、原文
     */
    public static String decrypt(byte[] data, byte[] key) {
        try {
            Key k = toKey(key);
            Cipher cipher = Cipher.getInstance(CIPHER_ALGORITHM_ECB);
            cipher.init(Cipher.DECRYPT_MODE, k);
            return DataUtil.bytesToHexString(cipher.doFinal(data));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public static void main(String[] args) {
//        String data = "111F152A3F7530CF3F6C58FB16FCA746C9B6504B2900040D";
//
//        int a = data.length();
//
//        String randomNumHex = data.substring(2, 10);
//
//        StringBuilder dataa = new StringBuilder(data.substring(10, data.length() - 6));
//
//
//        for (int i = 0; i < 8; i++) {
//            int b = dataa.length() / 2;
//            if ((b % 8) != 0) {
//                dataa.append("00");
//            }
//        }
//
//
//        String key = generateKey(randomNumHex);
//
//        byte[] bytes1 = DataUtil.hexStringToBytes(dataa.toString());
//
//        byte[] bytes = DataUtil.hexStringToBytes(data);
//
//        String decrypt = decrypt(DataUtil.hexStringToBytes(dataa.toString()), DataUtil.hexStringToBytes(key));
//
//        System.out.println(decrypt + "\n" + decrypt.length());
//
//        String v = "d918658e2f d4d17128 1f463b 262069 809e87963121670295";

        String a = "00000001 0007cc 000004 24c4cd75 00 00";

        Integer b = 616877429;

        Integer c = 946656000;

        System.out.println(b + c);

    }


}
