package com.stream.java.Java8Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SreamObject {
	public static void main(String[] args) {
		//create empty stream
		Stream<Object> stream = Stream.empty();
		stream.forEach(e -> {
			System.out.println(e);
		});
		//convert Array,Object,Collection to Stream
		String[] name = { "shalu", "divya", "avi" };
		Stream<String> st = Stream.of(name);
		st.forEach(s -> System.out.println(s));
		
		Stream.builder().build();
		//Array to Stream
		IntStream stream2 = Arrays.stream(new int[] {2,4,6,4});
		stream2.forEach(t->System.out.println(t));
		System.out.println("                   ");
		List<Integer> li=new ArrayList<>();
		li.add(45);
		li.add(81);
		li.add(99);
		li.stream().forEach(y->System.out.println(y));
		
		

	}

}
