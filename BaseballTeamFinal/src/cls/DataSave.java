package cls;

import dto.HumanDto;
import file.FileProc;
import singleton.Singleton;

public class DataSave implements BaseballDao {

	FileProc fp;
	
	public DataSave(FileProc fp) {
		this.fp = fp;
	}
	
	@Override
	public void process() {
		Singleton si = Singleton.getInstance();
		
		String datas[] = new String[si.list.size()];
		for (int i = 0; i < si.list.size(); i++) {
			HumanDto h = si.list.get(i);
			datas[i] = h.alldata();
		}		
		
		fp.fileSave(datas);
		
	}

}
