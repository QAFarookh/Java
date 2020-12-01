package com.selenium.StringBuffer;

public class StringBufferDemo {

	public static void main(String[] args) {
	
		StringBuffer sb = new StringBuffer();
		System.out.println(sb);
		sb.append(" to myQA");
		System.out.println(sb);
		System.out.println(sb.insert(4,"Sonu"));
		System.out.println(sb.delete(4, 8));
		System.out.println(sb.reverse());
		System.out.println(sb.length());
		System.out.println(sb.reverse());
		System.out.println(sb.charAt(3));
		System.out.println(sb.capacity());
		System.out.println(sb.indexOf("l"));
		System.out.println(sb.substring(3));
		System.out.println(sb.substring(3, 12));
		System.out.println(sb.subSequence(3,12 ));
		System.out.println(sb);
		

	}

}
