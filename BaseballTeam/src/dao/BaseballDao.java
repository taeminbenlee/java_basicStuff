package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

import dto.BatterDto;
import dto.HumanDto;
import dto.PitcherDto;
import file.DataProc;


public class BaseballDao {
	Scanner sc = new Scanner(System.in);
	
//	PitcherDto pit[] = new PitcherDto[30];
//	BatterDto bat[] = new BatterDto[30];
	private ArrayList<HumanDto>list = new ArrayList<HumanDto>();
	//private HumanDto human[] = new HumanDto[30];	
	private int memberNum;
	private DataProc dp;
	
	@SuppressWarnings("unlikely-arg-type")
	public BaseballDao() {
		
		dp = new DataProc("lions");
		dp.createFile();
		
		dataLoad();
		
		
		int lastIndexNumber = 0;
		for (int i = 0; i < list.size(); i++) {
			if(list != null) {
				lastIndexNumber = i;
			}
		}
		
		if(lastIndexNumber > 0) {
			memberNum = 1001 + ( list.lastIndexOf(lastIndexNumber) % 1000 );
		}else {		
			memberNum = 1001;
		}
		
		/*
		human[0] = new PitcherDto(1001, "홍길동", 24, 180, 10, 2, 0.23);
		human[1] = new BatterDto(2002, "일지매", 21, 182, 15, 3, 0.25);
		human[2] = new PitcherDto(1003, "홍길동", 26, 175, 12, 4, 0.33);
		*/
	}
	
	public void insert() {
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
		
		HumanDto hu = null;
		
		if(pos == 1) { // 투수
			
			System.out.print("승 = ");
			int win = sc.nextInt();
			
			System.out.print("패 = ");
			int lose = sc.nextInt();
			
			System.out.print("방어율 = ");
			double defence = sc.nextDouble();
			
			hu = new PitcherDto(memberNum, name, age, height, win, lose, defence);
			list.add(hu);
		}
		else {	// 타자
			
			System.out.print("타수 = ");
			int batcount = sc.nextInt();
			
			System.out.print("안타수 = ");
			int hit = sc.nextInt();
			
			System.out.print("타율 = ");
			double hitAvg = sc.nextDouble();
			
			hu = new BatterDto(memberNum + 1000, name, age, height, batcount, hit, hitAvg);
			list.add(hu);
		}
		
		//human[memberCount] = hu;
		
		memberNum++;	// 선수 등록 번호
		//memberCount++;	// 관리 배열의 index		
	}
	
	public void delete() {
		System.out.print("삭제하고 싶은 선수명 = ");
		String name = sc.next();
		
		int index = search(name.trim());	// "이병규 " != "이병규" 
		if(index == -1) {
			System.out.println("선수명단에 없습니다");
			return;
		}
		list.remove(index);
		System.out.println("삭제완료!");
		/*
		if(human[index] instanceof PitcherDto) {
			PitcherDto p = (PitcherDto)human[index];
			p.setNumber(0);
			p.setName("");
			p.setAge(0);
			p.setHeight(0.0);
			p.setWin(0);
			p.setLose(0);
			p.setDefence(0.0);			
		}
		
		else if(human[index] instanceof BatterDto) {
			BatterDto b = (BatterDto)human[index];
			b.delete();
		}
		*/
	}
	
	public void select() {
		System.out.print("검색하고 싶은 선수명 = ");
		String name = sc.next();
		int index = -1;
		for (int i = 0; i < list.size(); i++) {
			HumanDto hu= list.get(i);
			if(name.equals(hu.getName())) {
				index=i;
				System.out.println("검색된 데이터:" + list.get(index).toString());
				break;
			} else {
				System.out.println("데이터가 없습니다");
			}
		}
		
		/*
		int count = 0;
		for (int i = 0; i < human.length; i++) {
			if(human[i] != null && !human[i].getName().equals("")) {
				if(name.equals(human[i].getName())) {
					count++;
				}
			}
		}
		
		if(count < 1) {
			System.out.println("검색한 선수는 없습니다");
			return;
		}
		
		HumanDto man[] = new HumanDto[count];
		int n = 0;
		for (int i = 0; i < human.length; i++) {
			if(human[i] != null && !human[i].getName().equals("")) {
				if(name.equals(human[i].getName())) {
					man[n] = human[i];
					n++;
				}
			}
		}
		
		// 검색된 선수명단
		for (int i = 0; i < man.length; i++) {
			System.out.println(man[i].toString());
		}		
		*/
	}
	
	public void update() {
		System.out.print("수정하고 싶은 선수명 = ");
		String name = sc.next();
		
		int index = search(name.trim());	
		if(index == -1) {
			System.out.println("선수명단에 없습니다");
			return;
		}
		/*
		if(human[index] instanceof PitcherDto) {
			System.out.print("방어율 = ");
			double defence = sc.nextDouble();
			
			PitcherDto p = (PitcherDto)human[index];
			p.setDefence(defence);					
		}
		else if(human[index] instanceof BatterDto) {
			System.out.print("타율 = ");
			double hitAvg = sc.nextDouble();
			
			BatterDto b = (BatterDto)human[index];
			b.setHitAvg(hitAvg);			
		}		
		*/
		
		if(list.get(index) instanceof PitcherDto) {
			System.out.print("방여울= ");
			double defence = sc.nextDouble();
			PitcherDto p = (PitcherDto)list.get(index);
			p.setDefence(defence);
			System.out.println("수정되었습니다.");
		} else if(list.get(index) instanceof BatterDto){
			System.out.print("타율: ");
			double hitAvg=sc.nextDouble();
			BatterDto b = (BatterDto)list.get(index);
			b.setHitAvg(hitAvg);
			System.out.println("수정되었습니다.");
		}
		
			
		}
		
	
	public int search(String name) {		
		int index = -1;
		/*
		for (int i = 0; i < human.length; i++) {
			if(human[i] != null && !human[i].getName().equals("")) {
				if(name.equals(human[i].getName())) {
					index = i;
					break;
				}
			}
		}
		*/
		for (int i = 0; i < list.size(); i++) {
			HumanDto hu = list.get(i);
			if(hu.getName().contains(name)) {
				index=i;
				break;
			}
		}
		return index;
	}
	
	public void allprint() {
		for (int i = 0; i < list.size(); i++) {
			HumanDto hu = list.get(i);
			System.out.println(hu.toString());
		}
		/*
		for (int i = 0; i < human.length; i++) {
			if(human[i] != null && !human[i].getName().equals("")) {
				System.out.println(human[i].toString());
			}
		}
		*/
	}
	
	public void dataSave() {
		// 1001-홍길동-24-180-10-2-
		int len = 0;
		for (int i = 0; i < list.size(); i++) {
			if(list != null && !list.get(i).getName().equals("")) {
				len++;
			}
		}
		
		String datas[] = new String[len];
		int w = 0;
		for (int i = 0; i < list.size(); i++) {
			if(list != null && !list.get(i).getName().equals("")) {
				datas[w] = list.get(i).alldata(); 
				w++;
			}
		}
		
		for (int i = 0; i < datas.length; i++) {
			System.out.println(datas[i]);
		}
		
		dp.fileSave(datas);		
	}
	
	public void dataLoad() {
		String datas[] = dp.fileLoad();
		
		for (int i = 0; i < datas.length; i++) {
			String data[] = datas[i].split("-");
			int pos = Integer.parseInt(data[0]);			
			if(pos < 2000) {	// 투수
				new PitcherDto(	Integer.parseInt(data[0]),						
											data[1], 
											Integer.parseInt(data[2]), 
											Double.parseDouble(data[3]), 
											Integer.parseInt(data[2]), 
											Integer.parseInt(data[2]), 
											Double.parseDouble(data[3]));
			}
			else {				// 타자
				new BatterDto(	Integer.parseInt(data[0]),						
											data[1], 
											Integer.parseInt(data[2]), 
											Double.parseDouble(data[3]), 
											Integer.parseInt(data[2]), 
											Integer.parseInt(data[2]), 
											Double.parseDouble(data[3]));
			}			
		}
		
	}

	public void sortBy() {
		for (int i = 0; i < list.size(); i++) {
			list.get(i);
			if(list.get(i) instanceof BatterDto) {
		HashMap<Double, String> hitAvgMap = convertArrayListToHashMap(list);
		TreeMap<Double, String> tMap = new TreeMap<Double, String>(hitAvgMap);
		
		Iterator<Double> itKey = tMap.keySet().iterator();
		
		System.out.println("===================================");
		while(itKey.hasNext()) {
			Double k = itKey.next();
			String v = tMap.get(k);
			System.out.println("타율: "+k + " 이름: "+v);
		}
		}
		}
	}

	private HashMap<Double, String> convertArrayListToHashMap(ArrayList<HumanDto> list) {
		HashMap<Double, String>hashMap = new HashMap<>();
		for (HumanDto bt : list) {
			hashMap.put(((BatterDto) bt).getHitAvg(), bt.getName());
		}
		return hashMap;
	}
	
	
}







