
public class TempRunnable implements Runnable {

	@Override
	public void run() {
		try {
			for(int index=0; index<4; index++) {
				System.out.println(Thread.currentThread() + " Index :"+ index);
				Thread.sleep(3000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
