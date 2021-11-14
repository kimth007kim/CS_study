package ex4_thread_priority;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

//	public void setMemory(int memory) {
//		this.memory = memory;
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//		}
//		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
//	}
	
//	동기화메소드로 수정
	public synchronized void setMemory(int memory) {
		this.memory=memory;
		try {
			Thread.sleep(2000);
		}catch (InterruptedException e) {
		}
		System.out.println(Thread.currentThread().getName()+": "+this.memory);
	}
}
