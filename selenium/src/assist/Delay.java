package assist;

public class Delay {
	//��ʱ��䣬��ȷ����
		public static void delay(int i) {
			// TODO Auto-generated method stub
			try{
				Thread.sleep(i*1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
}
