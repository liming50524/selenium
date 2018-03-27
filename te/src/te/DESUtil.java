package te;

import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;

/**
 * 加密解密
 * @author 白乾涛
 */
public class DESUtil {
	  /** 没有token时的默认key*/
	  public static final String KEY = "1e469f986f5d4991a83b95d4";
	//【Token】kUMZ2s4NXksy0LnsCzZKZzfPYnOBYyRbrUqE2Yk40NXT5AT4i/SrBbDXrRn3UY01ggUF1LQ2IwjL8kObRxn93g==
	static String TOKEN="AG/ZJcVjQUeviSZpChvhk1UqV8Ky5UHsiNjqJ14a0LnG3qaJxoMyARMipz7OaZIAsjtIRb5rGyEQHFANKLXX9A==";
	static String fail="yjEoXKZCEiRvWUMfViXG+5hLrZ0/3sfMAT1RPQoC3yi//7gS6HKNI6podrCE4PXhBl1QlA8eNgo5BNt7A4ONsZhoLq91cOpvkjgS7KpGbZE=";
	static String KEY_NEW="cdf0f4f4e70b471392976b2d";
	static String MESSAGE="eeeR/7nNl6v9zkZu24FhpesKSBPJZbSfqGys6sF0uKIn+anN8Dvow5z5gb4ouKCfKXZ/1J7I2TKXpFBrhtaW/JbO58HVhnjcySGyYRb9BAQErci+x/gSp438mByT5GKfdB1wRYtyCdqirN/cLJZ9rF4N9LJAEKvxWRvBYklzO179kv8guf3r2qg9bReGSO6UHxhqEfN86gyDVTU7dM9dolfYRja+xq7zsCq0Trdx1t0QI0Px46+4d8jHEqC7jOoGQa+FDwd+MrkbjE7gJm1TqY/u8Z34RcGIyVco+8+N3/Jbjc4YMnPwEcjHEqC7jOoGrm1J87uxu1eNYcGt/BpkBoc/47PavAs3";
	static String tets="yjEoXKZCEiS6mpqj7DHj5IQafk6+sqnak6c0h1aPcIqcjlUT0kZyiKmSWdFV+lwsggu8wjy0YkxdFthI2iYVtjwMkKyQ2gKOp+HmjNfTHKVpJeQDkDYB3+vuPlV9q6FK3LBgRskC9FWG9y2eBjRawsQnWv5N+nyoor5V0ETb2xjTHnCK190SnslJr8z/OJf4";
	static 	String bb="rt4X+kayL8NvNy3OPQBgYtcIf5vZrA0L5ifnlM+JnGur3SfnetHZUXuHP7uO0MNP8k+vChBLoRFsWQif8xyJhQ==";

	public static void main(String[] args) throws Exception {
//输出登陆解密后的字
		
System.out.println(loginAndGetToken(bb));

//获取密钥
//System.out.println(decodeKeyFromToken(TOKEN));
//解密不是登陆信息
System.out.println(new String(des3EncodeECB(KEY.getBytes("utf-8"),tets.getBytes("utf-8"),Cipher.DECRYPT_MODE),"utf-8"));
//通过获取的密钥进行解密
//System.out.println(new String(des3EncodeECB(KEY_NEW.getBytes("utf-8"),MESSAGE.getBytes("utf-8"),Cipher.DECRYPT_MODE),"utf-8"));
//System.out.println(logjiami("lkjkljkljl"));	
	}
//	String json_str = "{\"username\":\"15800001144\",\"password\":\"12345678\"}";  #请求的参数
	//解密例子
	public static String loginAndGetToken(String bb) throws Exception {
		//		String cc="Mobile=15800001144&Password=12345678";
		byte[] b=des3EncodeECB(KEY.getBytes("utf-8"),bb.getBytes("utf-8"),Cipher.DECRYPT_MODE);
		return new String(b,"utf-8");
		
	}
	//加密例子
	public static String logjiami(String cc) throws Exception {
//		String cc="Mobile=15800001144&Password=12345678";
		byte[] b=des3EncodeECB(KEY.getBytes("utf-8"), cc.getBytes("utf-8"),Cipher.ENCRYPT_MODE);
		byte[] b2=Base64.getEncoder().encode(b);
		return new String(b2,"utf-8");
		
		
	}
		
  /**
   * 从加密了的token中获取key
   */
  public static String decodeKeyFromToken(String encodeToken) {
    try {
//      byte[] baseDecodeResult =Base64.getDecoder().decode(encodeToken);
      byte[] keybyte = KEY.getBytes("utf-8");
      byte[] decodeByte_ECB = des3EncodeECB(keybyte, encodeToken.getBytes("utf-8"),Cipher.DECRYPT_MODE);
      String decodeString_ECB = new String(decodeByte_ECB, "UTF-8");
      // 从已加密的token中解析key
      // 先解密token为铭文，再解析字符串    {usertoken}|{secutiryKey}
      if (null != decodeString_ECB && decodeString_ECB.contains("|")) return decodeString_ECB.substring(decodeString_ECB.indexOf("|") + 1);
      return null;
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }

  /**
   * 加密时Cipher.ENCRYPT_MODE=1，解密时Cipher.DECRYPT_MODE=2
   */

  public static byte[] des3EncodeECB(byte[] key, byte[] data,int mode) throws Exception {//KEY.getBytes("utf-8");
	if(mode==Cipher.DECRYPT_MODE)
		data=Base64.getDecoder().decode(data);
	else if(mode==Cipher.ENCRYPT_MODE);
//		data=Base64.getEncoder().encode(data);
    DESedeKeySpec spec = new DESedeKeySpec(key);
    SecretKeyFactory keyfactory = SecretKeyFactory.getInstance("desede");
    SecretKey deskey =  keyfactory.generateSecret(spec);
    Cipher cipher = Cipher.getInstance("desede");
    cipher.init(mode, (java.security.Key) deskey);
    return cipher.doFinal(data);
  }
  
//  public static byte[] des3EncodeECB(byte[] key, byte[] data) throws Exception {//KEY.getBytes("utf-8");
//	    DESedeKeySpec spec = new DESedeKeySpec(key);
//	    SecretKeyFactory keyfactory = SecretKeyFactory.getInstance("desede");
//	    SecretKey deskey =  keyfactory.generateSecret(spec);
//	    Cipher cipher = Cipher.getInstance("desede");
//	    cipher.init(Cipher.ENCRYPT_MODE, (java.security.Key) deskey);
//	    return cipher.doFinal(data);
//	  }
  
  
}