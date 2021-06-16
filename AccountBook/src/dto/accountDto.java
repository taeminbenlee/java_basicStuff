package dto;

//Data Transfer Object //종이한장 File
public class accountDto { // extends Object 이게 숨겨져있는것이다 그렇기에 constructor에 super();가 붙는다. 생략가능
	private String dateTime; 	//날짜 -> calendar class를 사용 
	private String title;			//용도	
	private String classify;	//수입/지출
	private int money;			//금액
	private String memo;		//내용
	public accountDto() { //overload
		
	}
	//source generate constructor using fields
	public accountDto(String dateTime, String title, String classify, int money, String memo) {
		this.dateTime = dateTime;
		this.title = title;
		this.classify = classify;
		this.money = money;
		this.memo = memo;
	}
	// generate getter setter
	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String gettitle() {
		return title;
	}

	public void settitle(String title) {
		this.title = title;
	}

	public String getClassify() {
		return classify;
	}

	public void setClassify(String classify) {
		this.classify = classify;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	//generate toString
	@Override
	public String toString() {
		return "출력 [시간=" + dateTime + ", 용도=" + title + ", 분류=" + classify + ", 금액=" + money
				+ ", 메모=" + memo + "]";
	}
}
