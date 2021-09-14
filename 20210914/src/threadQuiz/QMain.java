package threadQuiz;

import java.awt.Toolkit;

public class QMain {

	public static void main(String[] args) {
		// 여러종류의 쓰레드 만들기 익명 쓰레드 포함
		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i= 0;i<5 ;i++) {
					System.out.println(i);
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		};
		Runnable r2 = new Runnable() {

			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}		
			}
		};

		Thread t1 =new Thread(r1);
		t1.start();
		Thread t2 =new Thread(r2);
		t2.start();
		Thread t3 = new Thread(new Runnable() {

			@Override
			public void run() {

				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}		


			}
		});
		t3.start();

	}

}
