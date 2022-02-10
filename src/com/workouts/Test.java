package com.workouts;
/*
  Input (string) Output (string) 

   aabbcc a2b2c2  
   aaabbbccc a3b3c3
   aabbaaa a2b2a3
*/

public class Test {

	public static void main(String[] args) {
		String in = "aabbcc";
		
		calculate(in);
	}
	
	static void calculate(String in) {
		int count = 1;
		char st = 0;
		char[] ch = in.toCharArray();  //aabbccc
	    String ss = null;
		for(int i = 0; i < ch.length -1; i++) {
			if(ch[i] == ch[i+1]) {
				if(ss != null && ss.contains(ss.valueOf(ch[i]))) {
					count = count + 1;
					ss.concat(ss.valueOf(count));
				} else {  
					st = ch[i];
					count = count + 1;
					ss = ss.valueOf(st);
					ss.concat(ss.valueOf(count));
				}
			} else {
				continue;
			}
			System.out.print(ss);
			count = 1;
		}
	}

}
