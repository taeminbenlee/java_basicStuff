package util;

import java.util.List;

import dto.HumanDto;

public class UtilClass {

	public static int search(String name, List<HumanDto> list) {	
		
		int index = -1;		
		for (int i = 0; i < list.size(); i++) {
			HumanDto h = list.get(i);
			if(name.equals(h.getName())) {
				index = i;
				break;
			}
		}		
		
		return index;
	}
	
	
}
