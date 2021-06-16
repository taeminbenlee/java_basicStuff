package cls;

import dto.HumanDto;
import singleton.Singleton;

public class AllprintClass implements BaseballDao {

	@Override
	public void process() {
		Singleton si = Singleton.getInstance();
		
		for (HumanDto h : si.list) {
			System.out.println(h.toString());
		}
	}

}
