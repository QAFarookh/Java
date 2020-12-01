package com.java.RoughJavaProgram;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String>set=new HashSet<>();
		
		set.add("xyz");
		set.add("abc");
		set.add("xyz");
		set.add("xyz");
		set.add("xyz");
		System.out.println(set.size());

	}

}
