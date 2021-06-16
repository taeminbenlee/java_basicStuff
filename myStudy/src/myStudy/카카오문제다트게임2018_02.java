package myStudy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 카카오문제다트게임2018_02 {

	static int sum[] = new int[3];
	public static void main(String[] args) {
		//1	1S2D*3T		37		1^1 * 2 + 2^2 * 2 + 3^3
		//2	1D2S#10S	9		1^2 + 2^1 * (-1) + 10^1
		//3	1D2S0T		3		1^2 + 2^1 + 0^3
		//4	1S*2T*3S	23		1^1 * 2 * 2 + 2^3 * 2 + 3^1
		//5	1D#2S*3S	5		1^2 * (-1) * 2 + 2^1 * 2 + 3^1
		//6	1T2D3D#		-4		1^3 + 2^2 + 3^2 * (-1)
		//7	1D2S3T*		59		1^2 + 2^1 * 2 + 3^3 * 2

		run("1S2D*3T");
		run("1D2S#10S");
		run("1D2S0T");
		run("1S*2T*3S");
		run("1D#2S*3S");
		run("1T2D3D#");
		run("1D2S3T*");
	
		
	}
	public static void run(String msg) {
		String regex = "(\\d{1,2}[S|T|D][*|#]{0,1})"; //0~10 까지의 수이기 때문에 10은 2자리수이라서 1,2 이다
		Pattern p = Pattern.compile(regex+regex+regex);
		Matcher m = p.matcher(msg);
		m.find();
		for (int i = 1; i <= m.groupCount(); i++) { //패턴은 i =1부터 시작
			Pattern p1 = Pattern.compile("(\\d{1,2})([S|T|D])([*|#]{0,1})"); //괄호로 3개로 구분지어준다
			Matcher m1 = p1.matcher(m.group(i));
			m1.find();
			sum[i-1] = (int) Math.pow(Integer.parseInt(m1.group(1)), 
										getPow(m1.group(2)));
			setOption(i,m1.group(3));
		}
		System.out.println(msg + " - " + (sum[0]+sum[1]+sum[2]));
	}
	public static void setOption(int idx, String m) {
		if("*".equals(m)) {
			sum[idx - 1] *= 2;
			if(idx>1) {
				sum[idx-2] *= 2;
			}
		}
		else if("#".equals(m)) {
			sum[idx-1] *= -1;
		}
	}
	
	public static int getPow(String m) {
		int val = 0;
		if("S".equals(m)) {
			val = 1;
		}
		else if("D".equals(m)) {
			val = 2;
		}else if("T".equals(m)) {
			val = 3;
		}
			return val;
	}
}
