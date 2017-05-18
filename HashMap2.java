package com.cts.xml;

import java.util.HashMap;

public class HashMap2 {

	protected void msg() {
		System.out.println("Hello java");
	}

	public static void main(String[] args) {

		String s = "Naveen";
		s = s.toLowerCase();
		/*HashMap<Character, Integer> hs = new HashMap<Character, Integer>();

		char[] ch = s.toCharArray();

		for (char c : ch) {

			if (hs.containsKey(c)) {
				hs.put(c, hs.get(c) + 1);
			}

			else {
				hs.put(c, 1);
			}

		}
		System.out.println(hs);*/
		
		int count=0;
		
		char[] ch=s.toCharArray();
		
		for(int i=0;i<ch.length;i++){
		
		char cd=ch[i];
		
		for (char c : ch) {
			if(cd==c){
				count++;
			}
			
		}
		System.out.println(count+" "+cd);
		count=0;	
				
			}
			
	}

	

}
