package singleton;

import java.util.ArrayList;
import java.util.List;

import dto.HumanDto;

public class Singleton {

	private static Singleton s = null;
	
	public List<HumanDto> list = new ArrayList<HumanDto>();
	
	private Singleton() {
	}
	
	public static Singleton getInstance() {
		if(s == null) {
			s = new Singleton();
		}
		return s;
	}
	
}
