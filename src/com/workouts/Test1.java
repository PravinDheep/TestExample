package com.workouts;
/*
  Input (string) Output (string) 

   aabbcc a2b2c2  
   aaabbbccc a3b3c3
   aabbaaa a2b2a3
*/

public class Test1 {

	public static void main(String[] args) {
		String in = "aabbb";
		
		calculate(in);
	}
	
	static void calculate(String in) {
		
		char st = 0;
		char[] ch = in.toCharArray();  //input: aabbccc , outputL a2b2c3
	    String ss = null;
	    int count = 1;
		for(int i = 1; i < ch.length; i++) {
			if(ch[i] == ch[i+1]) {
				if(ss != null && ss.contains(ss.valueOf(ch[i]))) {
					count = count + 1;
					ss.replaceAll(ss.valueOf(ch[i]), ss.valueOf(count));
					/*
					 * int end = ch[i]; count = count + 1; String s1 =
					 * String.valueOf(ss.lastIndexOf(count)); ss =
					 * ss.replaceAll(s1,String.valueOf(count));
					 */
				} else {  
					st = ch[i];
					count = count + 1;
					ss = ss.valueOf(st).concat(ss.valueOf(count));
				}
			} else {
				continue;
			}
			System.out.print(ss);
		}
	}

}
