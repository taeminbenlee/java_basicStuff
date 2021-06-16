package main;

import java.awt.List;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MainClass {

	public static void main(String[] args) {
		/*
				HashMap : 사전
							"사과" : "apple"
							key : value -> json
							key 값을 넣으면 value값이 나옴
							tree 구조
							key로 관리
							
				TreeMapp : HashMap + sorting
				
				
		 */

		
		HashMap<Integer, String> hMap = new HashMap<Integer, String>();
		//Map<Integer, String>hMap = new HashMap<Integer, String>();
		//추가
		hMap.put(11, "십일");
		hMap.put(22, "이십이");
		hMap.put(33, "삼십삼");
		
		String value = hMap.get(22);
		System.out.println(value);
		
		//삭제 (키값을 넣어서 삭제)
		//hMap.remove();
		String del = hMap.remove(11);
		System.out.println("삭제데이터: "+del);
		System.out.println(hMap.size());
		//hMap.clear(); //모두삭제
		
		//검색
		//hMap.get();
		//있다 없다
		boolean b = hMap.containsKey(22);
		if(b==true) {
			String s = hMap.get(22);
			System.out.println("value: "+s);
		}
		System.out.println(hMap.get(22));
		
		
		//수정
		hMap.replace(22, "이십+이");
		System.out.println(hMap.get(22));
		hMap.put(22, "이십 플러스 이");
		System.out.println(hMap.get(22)); //중복 키는 허용하지 않고 새로운 값으로 변경
		//모든 키 값을 취득
		Iterator<Integer>it = hMap.keySet().iterator();
		while(it.hasNext()) {
			Integer k = it.next();
			System.out.println("key:" + k);
			
			String v = hMap.get(k);
			System.out.println("value: "+ v);
		}
		// Print keys
		for (int i : hMap.keySet()) {
		  System.out.println(i);
			}
		// Print values
		for (String i : hMap.values()) {
		  System.out.println(i);
		}
		// Print keys and values
		for (int i : hMap.keySet()) {
		  System.out.println("key: " + i + " value: " + hMap.get(i));
		}
	
	
		// 좋아하는 과일
		// key:value -> String
		// "apple":"사과"
		
		HashMap<String, String> fruits = new HashMap<String, String>();
		
		fruits.put("apple", "사과");
		fruits.put("grape", "포도");
		fruits.put("mango", "망고");
		fruits.put("cherry", "체리");
		fruits.put("melon", "멜론");
		
		System.out.println(fruits);
		
		Iterator<String>itt = fruits.keySet().iterator();
		while(itt.hasNext()) {
			String k = itt.next();
			System.out.println("key:" + k);
			
			String v = fruits.get(k);
			System.out.println("value: "+ v);
		}
		
		
		
		
		//TreeMap
		//sorting
		TreeMap<String, String> tMap = new TreeMap<String, String>(fruits);
		
		//오름
		Iterator<String> itKey = tMap.keySet().iterator();
		
		System.out.println("===================================");
		while(itKey.hasNext()) {
			String k = itKey.next();
			String v = tMap.get(k);
			System.out.println("key: "+k + " value: "+v);
		}
		//내림
		Iterator<String> ittKey = tMap.descendingKeySet().iterator();
		
		System.out.println("===================================");
		while(ittKey.hasNext()) {
			String k = ittKey.next();
			String v = tMap.get(k);
			System.out.println("key: "+k + " value: "+v);
		}
		
		
		
		
		
		
		
	
	}
}
