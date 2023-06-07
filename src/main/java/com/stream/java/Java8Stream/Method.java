package com.stream.java.Java8Stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Method {
	public static void main(String[] args) {
//		List<String>name=List.of("abhi","vinay","aman","shruti");
//		name.stream().filter(e->e.startsWith("v")).forEach(e->System.out.println(e));
//		List<String> s=name.stream().filter(e->e.contains("h")).collect(Collectors.toList());
//		System.out.println(s);
		List<Integer> l=List.of(12,6,27,9);
		List<Integer> collect = l.stream().map(i->i*i).collect(Collectors.toList());
		System.out.println(collect);
		l.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		
		
	}

}
