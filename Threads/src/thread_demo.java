
public class thread_demo {
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread("T1") {
			@Override
			public void run() {
				super.run();
				for(int i = 0; i < 10; i++) {
					System.out.println(getName() + " " + i);
				}
			}
		};
		
		Thread t2 = new Thread("T2") {
			@Override
			public void run() {
				super.run();
				for(int i = 0; i < 10; i++) {
					System.out.println(getName() + " " + i);
				}
			}
		};

		t1.start();
		t2.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Main " + i);
		}
		
	}

}
