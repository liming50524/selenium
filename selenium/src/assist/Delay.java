package assist;

public class Delay {
	//延时语句，精确到秒
		public static void delay(int i) {
			// TODO Auto-generated method stub
			try{
				Thread.sleep(i*1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
}
