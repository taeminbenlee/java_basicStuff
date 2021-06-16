package queue;

public class ArrayQueue {
	private int front;
	private int rear;
	private int maxSize;
	private Object[] arrayQueue;
	
	public ArrayQueue(int maxSize) {
		this.front = 0;
		this.rear = -1;
		this.maxSize = maxSize;
		this.arrayQueue = new Object[this.maxSize];
	}
	//가득차 있는지 확인
	public boolean full(){
		return(rear == maxSize-1);
	}
	//비어있는지 확인
	public boolean isEmpty(){
		return(rear+1 == front);   //초기 설정값이 front==0이ㄱ rear ==-1이기 때문에
		
	}
	//추가 (리어가 생성됨)
	public void push(Object item) {
		if(full()) {
			System.out.println("공간이 가득차 있습니다.");
			return;
		}
		rear++;
		arrayQueue[rear] = item;
	}
	//peek
	public Object peek() {
		if (isEmpty()) {
			System.out.println("공간이 비었습니다.");
			return null;
		}
		return arrayQueue[front];
	}
	//삭제 (front의 데이터)
	public Object pop() {
		Object item = peek();
		front++;
		return item;
	}
	
	
}
