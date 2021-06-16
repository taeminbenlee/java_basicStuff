package cls;

import java.util.Scanner;

import dto.BatterDto;
import dto.HumanDto;
import dto.PitcherDto;
import singleton.Singleton;
import util.UtilClass;

public class UpDateClass implements BaseballDao {
	Scanner sc = new Scanner(System.in);
		
	@Override
	public void process() {
		Singleton si = Singleton.getInstance();
		
		System.out.print("수정하고 싶은 선수명 = ");
		String name = sc.next();
		
		int index = UtilClass.search(name.trim(), si.list);	
		if(index == -1) {
			System.out.println("선수명단에 없습니다");
			return;
		}
		
		HumanDto human = si.list.get(index);
		
		if(human instanceof PitcherDto) {
			System.out.print("방어율 = ");
			double defence = sc.nextDouble();
			
			PitcherDto p = (PitcherDto)human;
			p.setDefence(defence);					
		}
		else if(human instanceof BatterDto) {
			System.out.print("타율 = ");
			double hitAvg = sc.nextDouble();
			
			BatterDto b = (BatterDto)human;
			b.setHitAvg(hitAvg);			
		}		
		
		System.out.println("성공적으로 수정되었습니다");		
	}

}
