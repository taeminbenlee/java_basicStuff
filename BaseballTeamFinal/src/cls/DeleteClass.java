package cls;

import java.util.Scanner;

import dto.HumanDto;
import singleton.Singleton;
import util.UtilClass;

public class DeleteClass implements BaseballDao {
	Scanner sc = new Scanner(System.in);
		
	@Override
	public void process() {
		Singleton si = Singleton.getInstance();
		
		System.out.print("삭제하고 싶은 선수명 = ");
		String name = sc.next();
		
		int index = UtilClass.search(name.trim(), si.list);	// "이병규 " != "이병규" 
		if(index == -1) {
			System.out.println("선수명단에 없습니다");
			return;
		}
		
		HumanDto h = si.list.remove(index);
		System.out.println(h.getName() + "선수의 데이터를 삭제 하였습니다");		
	}

}
