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
	
//	����ȭ�޼ҵ�� ����
	public synchronized void setMemory(int memory) {
		this.memory=memory;
		try {
			Thread.sleep(2000);
		}catch (InterruptedException e) {
		}
		System.out.println(Thread.currentThread().getName()+": "+this.memory);
	}
}
