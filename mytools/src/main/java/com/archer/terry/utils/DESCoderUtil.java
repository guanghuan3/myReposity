package com.archer.terry.utils;

import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

import org.apache.commons.codec.binary.Base64;

import sun.misc.BASE64Decoder;

/**
 * des加密工具类
 * 
 * @author Administrator
 *
 */
@SuppressWarnings("restriction")
public class DESCoderUtil
{
    private static final String KEY_PART = "TerRy084";

    private static final String KEY_ALGORITHM = "DES";

    /**
     * DES加密操作
     * 
     * @param srcData
     *            被加密数据
     * @return 被加密后的数据
     * @throws Exception
     */
    public static byte[] encrypt(byte[] datasource)
    {
        try
        {
            SecureRandom random = new SecureRandom();
            DESKeySpec desKey = new DESKeySpec(KEY_PART.getBytes());
            // 创建一个密匙工厂，然后用它把DESKeySpec转换成
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(KEY_ALGORITHM);
            SecretKey securekey = keyFactory.generateSecret(desKey);
            // Cipher对象实际完成加密操作
            Cipher cipher = Cipher.getInstance(KEY_ALGORITHM);
            // 用密匙初始化Cipher对象
            cipher.init(Cipher.ENCRYPT_MODE, securekey, random);
            // 现在，获取数据并加密
            // 正式执行加密操作
            return cipher.doFinal(datasource);
        }
        catch (Throwable e)
        {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * DES解密操作
     * 
     * @param src
     * @return
     * @throws Exception
     */
    public static byte[] decrypt(String src) throws Exception
    {
        // DES算法要求有一个可信任的随机数源
        SecureRandom random = new SecureRandom();
        // 创建一个DESKeySpec对象
        DESKeySpec desKey = new DESKeySpec(KEY_PART.getBytes());
        // 创建一个密匙工厂
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(KEY_ALGORITHM);
        // 将DESKeySpec对象转换成SecretKey对象
        SecretKey securekey = keyFactory.generateSecret(desKey);
        // Cipher对象实际完成解密操作
        Cipher cipher = Cipher.getInstance(KEY_ALGORITHM);
        // 用密匙初始化Cipher对象
        cipher.init(Cipher.DECRYPT_MODE, securekey, random);
        // 真正开始解密操作
        return cipher.doFinal(new BASE64Decoder().decodeBuffer(src));
    }

    /**
     * DES解密操作
     * 
     * @param src
     * @return
     * @throws Exception
     */
    public static byte[] decrypt(byte[] src) throws Exception
    {
        // DES算法要求有一个可信任的随机数源
        SecureRandom random = new SecureRandom();
        // 创建一个DESKeySpec对象
        DESKeySpec desKey = new DESKeySpec(KEY_PART.getBytes());
        // 创建一个密匙工厂
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(KEY_ALGORITHM);
        // 将DESKeySpec对象转换成SecretKey对象
        SecretKey securekey = keyFactory.generateSecret(desKey);
        // Cipher对象实际完成解密操作
        Cipher cipher = Cipher.getInstance(KEY_ALGORITHM);
        // 用密匙初始化Cipher对象
        cipher.init(Cipher.DECRYPT_MODE, securekey, random);
        // 真正开始解密操作
        return cipher.doFinal(src);
    }

    public static void main(String[] args) throws Exception
    {
        String srcData = "这是被加密的 数据11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111";
        System.err.println("源数据是：" + srcData);

        byte[] encDataByte = encrypt(srcData.getBytes());
        String encData = new String(Base64.encodeBase64(encDataByte));
        System.err.println("加密后的数据是：" + encData);

        byte[] decDataByte = decrypt(encData);
        System.err.println("解密后的数据是：" + new String(decDataByte));

        String decData = new String(decrypt(encDataByte));
        System.err.println("解密后的数据是：" + decData);

        byte[] encByteData = encData.getBytes();
        String decDataStr = new String(decrypt(Base64.decodeBase64(encByteData)));
        System.err.println(decDataStr);
    }
}
