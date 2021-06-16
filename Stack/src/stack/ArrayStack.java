package stack;

public class ArrayStack {

		private int top; //저장공간에 담기는 (데이터?)수
		private int maxSize;
		
		private Object stackArray[];
		
		public ArrayStack(int maxSize) {
			this.maxSize = maxSize;
			stackArray = new Object[maxSize];
			top = -1; // 빈통이라는 뜻 
		}
		//스택공간이 비어 있는지 확인하는 작업
		public boolean isEmpty() {
			return (this.top == -1);
		}
		//스택공간이 가득차있는지
		public boolean full() {
			return (this.top == maxSize-1); //-1인 이유는 0부터 들어가기때문에
		}
		
		//스택공간에 추가하는 작업
		public void push(Object item) { //추가 == push
			if(full()) {
				System.out.println("스택공간이 가득차 있습니다.");
				return;
			}
			
			top++;
			stackArray[top] = item; //top에 추가
		}
		//스택공간에 삭제
		public Object pop() {
			Object item = peek();//제일 상위의 데이터를 추린다.
			top--;
			return item;
		}
		//최상위의 데이터(공)을 찍어보는것(보는것) == peek
		public Object peek() {
			if(isEmpty()) {
				System.out.println("스택공간이 비어 있습니다.");
				return null;
			}
			return stackArray[top];
		}
}
