package myStudy;

import java.util.HashMap;
import java.util.Map;

/*
- 입력 형식

캐시 크기(cacheSize)와 도시이름 배열(cities)을 입력받는다.
cacheSize는 정수이며, 범위는 0 ≦ cacheSize ≦ 30 이다.
cities는 도시 이름으로 이뤄진 문자열 배열로, 최대 도시 수는 100,000개이다.
각 도시 이름은 공백, 숫자, 특수문자 등이 없는 영문자로 구성되며, 대소문자 구분을 하지 않는다. 도시 이름은 최대 20자로 이루어져 있다.

- 출력 형식
입력된 도시이름 배열을 순서대로 처리할 때, “총 실행시간”을 출력한다.

- 조건
캐시 교체 알고리즘은 LRU(Least Recently Used)를 사용한다.
cache hit일 경우 실행시간은 1이다.
cache miss일 경우 실행시간은 5이다.

- 입출력 예제
캐시크기(cacheSize)	도시이름(cities)																					실행시간
3	[“Jeju”, “Pangyo”, “Seoul”, “NewYork”, “LA”, “Jeju”, “Pangyo”, “Seoul”, “NewYork”, “LA”]							50
3	[“Jeju”, “Pangyo”, “Seoul”, “Jeju”, “Pangyo”, “Seoul”, “Jeju”, “Pangyo”, “Seoul”]									21
2	[“Jeju”, “Pangyo”, “Seoul”, “NewYork”, “LA”, “SanFrancisco”, “Seoul”, “Rome”, “Paris”, “Jeju”, “NewYork”, “Rome”]	60
5	[“Jeju”, “Pangyo”, “Seoul”, “NewYork”, “LA”, “SanFrancisco”, “Seoul”, “Rome”, “Paris”, “Jeju”, “NewYork”, “Rome”]	52
2	[“Jeju”, “Pangyo”, “NewYork”, “newyork”]																			16
0	[“Jeju”, “Pangyo”, “Seoul”, “NewYork”, “LA”]																		25
-- 캐시사이즈란 저기 위에 서 3개씩 묵어서 본다는것이고
-- 도시 하나당 5인데 이전 3개에 묶음에 포함되어 있으면 1 이라는 뜻
 */
public class 카카오문제캐시2018 {
	public static void main(String[]args) {
		LRUCache(3, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"});
		LRUCache(3, new String[]{"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"});
		LRUCache(2, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"});
		LRUCache(5, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"});
		LRUCache(2, new String[]{"Jeju", "Pangyo", "NewYork", "NewYork"});
		LRUCache(0, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA"});
	}
	public static void LRUCache(int cacheSize, String [] cities) { //위 예제와 같은 것을 담기위해 
		//output data 는 런닝타임, 캐시 가 필요하다
		int runningTime = 0; //초기화해놓자
		Map<String, Integer> map = new HashMap<String, Integer>();	
		for (int i = 0; i < cities.length; i++) {
			String target = cities[i];
			//1. 캐시에 도시가 있는지 찾는다.
			if(map.containsKey(target.toUpperCase())) {
				//1.1 값이 있으면 cache hit =1 러닝타임이 1씩증가
				runningTime++;
				/*
				for(String key : map.keySet()) {
					if(map.get(key)==1) {
					
						map.put(key, 3);
					}
					else {
					
						map.put(key, map.get(key) -1);
					}
				}
				*/	
			} else {
				//1.2 값이 없으면 cache miss 5 러닝타임이 5씩증가
				runningTime +=5;	
				//1.2.1 값이 없기때문에 비교를위해 캐시사이즈 보다 입력된 도시가 적으면 put
				if(cacheSize > map.size()) {
					map.put(target.toUpperCase(), map.size()+1);
				} else {
				//1.2.2 캐시사이즈 보다 입력된 도시가 같거나 많으면 remove & put
				String delKey = "";
				for(String key : map.keySet()) {
					if(map.get(key)==1) {
						//1.2.2.1 제거
						delKey = key;
					}
					else {
						//1.2.2.2 각 순위-1
						map.put(key, map.get(key) -1);
					}
				}
				//1.2.2.3 remove & put 처리 
				map.remove(delKey);
				map.put(target.toUpperCase(), map.size()+1);
				}
			}	
		}
		System.out.println("runningTime"+runningTime);
	}
}
