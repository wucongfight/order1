package com.yijiupi.unit;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/**
 * @Author: WuCong
 * @Date: 2019/1/17 11:11
 */
public class Md5 {
    public static String string(String input) {
        try {
            // 拿到一个转换器
            MessageDigest messageDigest = MessageDigest.getInstance("Md5");
            // 输入的字符串转换成字节数组
            byte[] inputByteArray = input.getBytes();
            // inputByteArray是输入字符串转换得到的字节数组
            messageDigest.update(inputByteArray);
            // 转换并返回结果，也是字节数组，包含16个元素
            byte[] resultByteArray = messageDigest.digest();
            // 字符数组转换成字符串返回
            StringBuffer stringBuffer = new StringBuffer();
            for (byte i : resultByteArray) {
                stringBuffer.append(i);
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }

}
