package te;


import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;

public class tes {
private static final String KEY="12449f986f5d4991283b95d4";
public static String decodeKey(String encodeToken) {
	try {
	      byte[] baseDecodeResult =Base64.getDecoder().decode(encodeToken);
	      byte[] keybyte = KEY.getBytes();
	      byte[] decodeByte_ECB = des3EncodeECB(keybyte, baseDecodeResult,2);
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
private static byte[] des3EncodeECB(byte[] key, byte[] data, int mode) throws Exception {
	// TODO Auto-generated method stub
	DESedeKeySpec spec=new DESedeKeySpec(key);
	SecretKeyFactory keyfactory=SecretKeyFactory.getInstance("desede");
	SecretKey deskey=keyfactory.generateSecret(spec);
	Cipher cipher=Cipher.getInstance("desede");
	cipher.init(mode, deskey);
	return cipher.doFinal(data);
}

}
