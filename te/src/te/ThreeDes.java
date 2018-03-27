package te;
import java.security.Security;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;


/*�ַ��� DESede(3DES) ����
 * ECBģʽ/ʹ��PKCS7��ʽ��䲻��λ,Ŀǰ������Կ��192λ
 * 3DES����Triple DES����DES��AES���ɵļ����㷨��1999�꣬NIST��3-DESָ��Ϊ���ɵ�
 * ���ܱ�׼������DES��һ������ȫ�ı��Ρ�����DESΪ����ģ�飬ͨ����Ϸ��鷽����Ƴ������
 * ���㷨�������ʵ�����£���Ek()��Dk()����DES�㷨�ļ��ܺͽ��ܹ��̣�K����DES�㷨ʹ�õ�
 * ��Կ��P�������ģ�C�����ܱ�������
 * 3DES���ܹ���Ϊ��C=Ek3(Dk2(Ek1(P)))
 * 3DES���ܹ���Ϊ��P=Dk1((EK2(Dk3(C)))
 * */
public class ThreeDes {

	/**
	 * @param args��java�е���sun��˾�ṩ��3DES���ܽ����㷨ʱ����Ҫʹ
	 * �õ�$JAVA_HOME/jre/lib/Ŀ¼�����µ�4��jar����
	 *jce.jar
	 *security/US_export_policy.jar
	 *security/local_policy.jar
	 *ext/sunjce_provider.jar 
	 */
	
	private static final String Algorithm = "DESede"; //��������㷨,���� DES,DESede,Blowfish
    //keybyteΪ������Կ������Ϊ24�ֽ�    
	//srcΪ�����ܵ����ݻ�������Դ��
	public static byte[] encryptMode(byte[] keybyte,byte[] src){
		 try {
			//������Կ
			SecretKey deskey = new SecretKeySpec(keybyte, Algorithm);
			//����
			Cipher c1 = Cipher.getInstance(Algorithm);
			c1.init(Cipher.ENCRYPT_MODE, deskey);
			return c1.doFinal(src);//�ڵ�һ����ļ��ܻ����
		} catch (java.security.NoSuchAlgorithmException e1) {
			// TODO: handle exception
			 e1.printStackTrace();
		}catch(javax.crypto.NoSuchPaddingException e2){
			e2.printStackTrace();
		}catch(java.lang.Exception e3){
			e3.printStackTrace();
		}
		return null;
	}
	
	//keybyteΪ������Կ������Ϊ24�ֽ�    
	//srcΪ���ܺ�Ļ�����
	public static byte[] decryptMode(byte[] keybyte,byte[] src){
		try {
			//������Կ
			SecretKey deskey = new SecretKeySpec(keybyte, Algorithm);
			//����
			Cipher c1 = Cipher.getInstance(Algorithm);
			c1.init(Cipher.DECRYPT_MODE, deskey);
			return c1.doFinal(src);
		} catch (java.security.NoSuchAlgorithmException e1) {
			// TODO: handle exception
			e1.printStackTrace();
		}catch(javax.crypto.NoSuchPaddingException e2){
			e2.printStackTrace();
		}catch(java.lang.Exception e3){
			e3.printStackTrace();
		}
		return null;		
	}
	
    //ת����ʮ�������ַ���
	public static String byte2Hex(byte[] b){
		String hs="";
		String stmp="";
		for(int n=0; n<b.length; n++){
			stmp = (java.lang.Integer.toHexString(b[n]& 0XFF));
			if(stmp.length()==1){
				hs = hs + "0" + stmp;				
			}else{
				hs = hs + stmp;
			}
			if(n<b.length-1)hs=hs+":";
		}
		return hs.toUpperCase();		
	}
//	public static byte[] hex(String username){
//		String key = "test";//�ؼ���
//		String f = DigestUtils.md5Hex(username+key);
//		byte[] bkeys = new String(f).getBytes();
//		byte[] enk = new byte[24];
//		for (int i=0;i<24;i++){
//			enk[i] = bkeys[i];
//		}
//		return enk;
//	}
//	public static void main(String[] args) {
//		//����°�ȫ�㷨,�����JCE��Ҫ������ӽ�ȥ
//		byte[] enk = hex("zeromike");//�û���
//		Security.addProvider(new com.sun.crypto.provider.SunJCE());
//		String password = "1234567";//����
//		System.out.println("����ǰ���ַ���:" + password);
//		byte[] encoded = encryptMode(enk,password.getBytes());
//		String pword = Base64.Encoder(encoded); 
//		System.out.println("���ܺ���ַ���:" + pword);
//		
//		byte[] reqPassword = Base64.decode(pword);
//		byte[] srcBytes = decryptMode(enk,reqPassword);
//		System.out.println("���ܺ���ַ���:" + (new String(srcBytes)));
//	}
}
