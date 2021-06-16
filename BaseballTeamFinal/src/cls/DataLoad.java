package cls;

import dto.BatterDto;
import dto.HumanDto;
import dto.PitcherDto;
import file.FileProc;
import singleton.Singleton;

public class DataLoad implements BaseballDao {

	FileProc fp;
	
	public DataLoad(FileProc fp) {
		this.fp = fp;
	}
	
	@Override
	public void process() {
		String datas[] = fp.fileLoad();
		
		for (int i = 0; i < datas.length; i++) {			
			String data[] = datas[i].split("-");
			int pos = Integer.parseInt(data[0]);
			
			HumanDto human = null;
			if(pos < 2000) {	// 투수
				human = new PitcherDto(	Integer.parseInt(data[0]),						
											data[1], 
											Integer.parseInt(data[2]), 
											Double.parseDouble(data[3]), 
											Integer.parseInt(data[4]), 
											Integer.parseInt(data[5]), 
											Double.parseDouble(data[6]));
			}
			else {				// 타자
				human = new BatterDto(	Integer.parseInt(data[0]),						
											data[1], 
											Integer.parseInt(data[2]), 
											Double.parseDouble(data[3]), 
											Integer.parseInt(data[4]), 
											Integer.parseInt(data[5]), 
											Double.parseDouble(data[6]));
			}	
			
			Singleton.getInstance().list.add(human);			
		}
		
	}

}
