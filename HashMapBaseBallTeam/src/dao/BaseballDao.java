package dao;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

import dto.BatterDto;
import dto.HumanDto;
import dto.PitcherDto;
import file.DataProc;


public class BaseballDao {
	Scanner sc = new Scanner(System.in);
	
//	PitcherDto pit[] = new PitcherDto[30];
//	BatterDto bat[] = new BatterDto[30];
	
	private HumanDto human[] = new HumanDto[30];	
	private int memberNum;
	private int memberCount;
	

	
	private DataProc dp;
	
	public BaseballDao() {
		
		dp = new DataProc("lions");
		dp.createFile();
		
		dataLoad();
		
		
		int lastIndexNumber = 0;
		for (int i = 0; i < human.length; i++) {
			if(human[i] != null) {
				lastIndexNumber = i;
			}
		}
		
		if(lastIndexNumber > 0) {
			memberNum = 1001 + ( human[lastIndexNumber].getNumber() % 1000 );
			memberCount = lastIndexNumber + 1;
		}else {		
			memberNum = 1001;
			memberCount = 0;	// human[] 관리하기 위한 변수
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
			
		}
		else {	// 타자
			
			System.out.print("타수 = ");
			int batcount = sc.nextInt();
			
			System.out.print("안타수 = ");
			int hit = sc.nextInt();
			
			System.out.print("타율 = ");
			double hitAvg = sc.nextDouble();
			
			hu = new BatterDto(memberNum + 1000, name, age, height, batcount, hit, hitAvg);
		}
		
		human[memberCount] = hu;
		
		memberNum++;	// 선수 등록 번호
		memberCount++;	// 관리 배열의 index		
	}
	
	public void delete() {
		System.out.print("삭제하고 싶은 선수명 = ");
		String name = sc.next();
		
		int index = search(name.trim());	// "이병규 " != "이병규" 
		if(index == -1) {
			System.out.println("선수명단에 없습니다");
			return;
		}
		
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
		
	}
	
	public void select() {
		System.out.print("검색하고 싶은 선수명 = ");
		String name = sc.next();
		
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
		
	}
	
	public void update() {
		System.out.print("수정하고 싶은 선수명 = ");
		String name = sc.next();
		
		int index = search(name.trim());	
		if(index == -1) {
			System.out.println("선수명단에 없습니다");
			return;
		}
		
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
		
		System.out.println("성공적으로 수정되었습니다");
	}
	
	public int search(String name) {		
		int index = -1;
		
		for (int i = 0; i < human.length; i++) {
			if(human[i] != null && !human[i].getName().equals("")) {
				if(name.equals(human[i].getName())) {
					index = i;
					break;
				}
			}
		}
		
		return index;
	}
	
	public void allprint() {
		for (int i = 0; i < human.length; i++) {
			if(human[i] != null && !human[i].getName().equals("")) {
				System.out.println(human[i].toString());
			}
		}
	}
	
	public void dataSave() {
		// 1001-홍길동-24-180-10-2-
		int len = 0;
		for (int i = 0; i < human.length; i++) {
			if(human[i] != null && !human[i].getName().equals("")) {
				len++;
			}
		}
		
		String datas[] = new String[len];
		int w = 0;
		for (int i = 0; i < human.length; i++) {
			if(human[i] != null && !human[i].getName().equals("")) {
				datas[w] = human[i].alldata(); 
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
			/*
				1001-홍길동-24-180.0-10-2-0.23
				2002-일지매-21-182.0-15-3-0.25
				1003-홍길동-26-175.0-12-4-0.33
			*/
			
			String data[] = datas[i].split("-");
			int pos = Integer.parseInt(data[0]);			
			if(pos < 2000) {	// 투수
				human[i] = new PitcherDto(	Integer.parseInt(data[0]),						
											data[1], 
											Integer.parseInt(data[2]), 
											Double.parseDouble(data[3]), 
											Integer.parseInt(data[2]), 
											Integer.parseInt(data[2]), 
											Double.parseDouble(data[3]));
			}
			else {				// 타자
				human[i] = new BatterDto(	Integer.parseInt(data[0]),						
											data[1], 
											Integer.parseInt(data[2]), 
											Double.parseDouble(data[3]), 
											Integer.parseInt(data[2]), 
											Integer.parseInt(data[2]), 
											Double.parseDouble(data[3]));
			}			
		}
		
	}
	
	
}







