package cls;

import java.util.Scanner;

import dto.BatterDto;
import dto.HumanDto;
import dto.PitcherDto;
import singleton.Singleton;

public class InsertClass implements BaseballDao {
	Scanner sc = new Scanner(System.in);
	private int memberNum;
	
	
	
	public InsertClass() {
		Singleton si = Singleton.getInstance();
		
		// 데이터가 없는 경우
		if(si.list.isEmpty()) {
			memberNum = 1001;
		}
		else {
			int lastIndexNumber = si.list.get( si.list.size() - 1 ).getNumber();
			if(lastIndexNumber > 0) {
				memberNum = 1001 + ( lastIndexNumber % 1000 );
			}		
		}
	}

	@Override
	public void process() {
		Singleton si = Singleton.getInstance();
		
		// 투수/타자 ?
		System.out.print("투수(1)/타자(2) = ");
		int pos = sc.nextInt();
		
		// human
		System.out.print("이름 = ");
		String name = sc.next();
		
		System.out.print("나이 = ");
		int age = sc.nextInt();
		
		System.out.print("신장 = ");
		double height = sc.nextDouble();
		
		HumanDto human = null;
		
		if(pos == 1) { // 투수
			
			System.out.print("승 = ");
			int win = sc.nextInt();
			
			System.out.print("패 = ");
			int lose = sc.nextInt();
			
			System.out.print("방어율 = ");
			double defence = sc.nextDouble();
			
			human = new PitcherDto(memberNum, name, age, height, win, lose, defence);
			
		}
		else {	// 타자
			
			System.out.print("타수 = ");
			int batcount = sc.nextInt();
			
			System.out.print("안타수 = ");
			int hit = sc.nextInt();
			
			System.out.print("타율 = ");
			double hitAvg = sc.nextDouble();
			
			human = new BatterDto(memberNum + 1000, name, age, height, batcount, hit, hitAvg);
		}
		
	
		si.list.add(human);
		
		memberNum++;	// 선수 등록 번호	
		
	}
	
}
