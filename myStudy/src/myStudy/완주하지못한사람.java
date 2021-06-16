package myStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;


public class 완주하지못한사람 {
	public static void main(String[] args) {
		//참여자
		String [][] participant = {
				
				{"leo", "kiki", "eden"}, {"marina", "josipa", "nikola", "vinko", "filipa"}, {"mislav", "stanko", "mislav", "ana"}
			
		};
		System.out.println("참여자:"+Arrays.deepToString(participant));
		//////////////////////////////////////////////////////////////////////////////
		//완주자
		String [][] completion = {
				
					{"eden", "kiki"}, {"josipa", "filipa", "marina", "nikola"}, {"stanko", "ana", "mislav"}
				
		};
		System.out.println("완주자:" +Arrays.deepToString(completion));
		//어레이 비교
		System.out.println(Arrays.deepEquals(participant, completion));
		
		
		/*
		 * for(int i = 0; i < participant.length; i++) { for(int j = 0; j <
		 * participant[i].length; j++) { String a = participant[i][j];
		 * //System.out.print(participant[i][j] + "\t"); for (int k = 0; k <
		 * completion.length; k++) { for (int l = 0; l < completion[k].length; l++) {
		 * String b = completion[k][l]; //System.out.print(completion[k][l] + "\t");
		 * if(!participant[i][j].contains(completion[k][l])) {
		 * System.out.println(participant[i][j]); } } } } }
		 */
		 // 2d 어레이의 값을 리스트로 옮겨준다 	 
		ArrayList<String> listP = new ArrayList<String>();
		for (String[] array: participant) {
			listP.addAll(Arrays.asList(array));
		}
		ArrayList<String> listC = new ArrayList<String>();
		for (String[] array: completion) {
			listC.addAll(Arrays.asList(array));
		}
		//결과용 리스트 참여자 똑같이 추후에 완료자를 지워줄꺼임
		
		//옮겨준 값의 확인
		System.out.println("ListP: " + listP);
		System.out.println("ListC: " + listC);
		
		/*
		 * //iterator Iterator<String>itr1 = listP.iterator(); Iterator<String>itr2 =
		 * listC.iterator();
		 * 
		 * while(itr1.hasNext()){ String id1 = (String)itr1.next();
		 * while(itr2.hasNext()){ String id2 = (String)itr2.next(); if(id1!=null &&
		 * id2!=null) { if(id2.equals(id1)) listCP.removeAll(listC);
		 * 
		 * } } }
		 */
		for (int i = 0; i < listC.size(); i++) {
			if(listC.get(i)==listC.get(i)) {
				listP.removeAll(listC);
				
			}
			
		}
		System.out.println("Final list:" + listP + "mislav");
	
}
}
