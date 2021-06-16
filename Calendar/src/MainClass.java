import java.util.Calendar;
import java.util.GregorianCalendar;

public class MainClass {
	public static void main(String[] args) {
		/*
			Calendar : 
			 	일정관리, 회원관리, 인사관리 
		*/
		
		// Calendar cal = new GregorianCalendar();
		
		Calendar cal = Calendar.getInstance();
		
		// 오늘 날짜 취득(getter)
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;	// 0 ~ 11
		int day = cal.get(Calendar.DATE);
		
		System.out.println(year + "년 " + month + "월 " + day + "일");
		
		// 날짜 설정(setter)
		cal.set(Calendar.YEAR, 2021);
		cal.set(Calendar.MONTH, 12 - 1);	// 0 ~ 11
		cal.set(Calendar.DATE, 31);
		
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) + 1;
		day = cal.get(Calendar.DATE);
		
		System.out.println(year + "년 " + month + "월 " + day + "일");
		
		String ampm = cal.get(Calendar.AM_PM)==0?"오전":"오후";
		System.out.println(ampm);		
		
		// 요일
		int weekday = cal.get(Calendar.DAY_OF_WEEK);	// 1(일) ~ 7(토)
		System.out.println(weekday);
		
		switch(weekday) {
			case 1:
				System.out.println("일요일");
				break;
			case 2:
				System.out.println("월요일");
				break;
			case 3:
				System.out.println("화요일");
				break;
			case 4:
				System.out.println("수요일");
				break;
			case 5:
				System.out.println("목요일");
				break;
			case 6:
				System.out.println("금요일");
				break;				
			case 7:
				System.out.println("토요일");
				break;			
		}
		
		cal.set(Calendar.YEAR, 2021);
		cal.set(Calendar.MONTH, 2 - 1);	// 0 ~ 11
		cal.set(Calendar.DATE, 1);
		
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) + 1;
		day = cal.get(Calendar.DATE);
		
		int lastday = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("마지막날:" + lastday);
		
		weekday = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(weekday);
		
		// 위의 빈칸
		int upEmpty = (weekday - 1) % 7;
		System.out.println(month + "월의 위의 빈칸은 " + upEmpty + "입니다");
		
		// 밑의 빈칸
		lastday = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		cal.set(Calendar.DATE, lastday);
		
		// 요일
		weekday = cal.get(Calendar.DAY_OF_WEEK);
		
		int downEmpty = 7 - weekday;
		System.out.println(month + "월의 밑의 빈칸 수 " + downEmpty);
				
		
		// 달력 만들기
		cal.set(Calendar.YEAR, 2021);
		cal.set(Calendar.MONTH, 6 - 1);	// 0 ~ 11
		cal.set(Calendar.DATE, 1);
		
		int startDay = cal.get(Calendar.DAY_OF_WEEK);	// 1 ~ 7
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		int _day = 1;
		
		System.out.println("2021년 6월");
		System.out.println("==========================================================================");
		
		String week_day = "일월화수목금토";
		
		for (int i = 0; i < week_day.length(); i++) {
			char c = week_day.charAt(i);
			System.out.print(c + "\t");
		}		
		System.out.println();
		
		System.out.println("==========================================================================");
		
		// 윗쪽 빈칸
		for (int i = 1; i < startDay; i++) {
			System.out.print("*" + "\t");
		}
		
		// 날짜
		for(int i = 0;i < lastDay; i++) {
			System.out.print(_day + "\t");
			
			if((_day + startDay - 1) % 7 == 0) {
				System.out.println();
			}
			_day++;
		}
		
		// 밑쪽 빈칸
		for (int i = 0; i < (7 - (startDay + lastDay - 1) % 7); i++) {
			System.out.print("*" + "\t");
		}
		
		System.out.println();
				
	}
}





