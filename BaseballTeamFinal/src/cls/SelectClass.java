package cls;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dto.HumanDto;
import singleton.Singleton;

public class SelectClass implements BaseballDao {
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void process() {
		Singleton si = Singleton.getInstance();
		
		System.out.print("검색하고 싶은 선수명 = ");
		String name = sc.next();
				
		List<HumanDto> findList = new ArrayList<HumanDto>();
		
		for (int i = 0; i < si.list.size(); i++) {
			String memName = si.list.get(i).getName();
			if(name.equals(memName)) {
				HumanDto h = si.list.get(i);
				findList.add( h );				
			}
		}
		
		if(findList.isEmpty()) {
			System.out.println("검색한 선수는 찾을 수 없습니다");
			return;
		}
		
		System.out.println("검색된 선수 명단입니다 >> ");
		for (int i = 0; i < findList.size(); i++) {
			HumanDto h = findList.get(i);
			System.out.println(h.toString());
		}
		
	}

}
