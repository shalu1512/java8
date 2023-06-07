package com.stream.java.Java8Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class App {
	public static void main(String[] args) {

		List<Integer> li = Arrays.asList(1, 6, 7,1 ,2,6,4);
		System.out.println(li);
		Set<Integer> set=li.stream().collect(Collectors.toSet());
//		List<Integer> list = List.of(3, 12, 34, 65);
//       List<Integer>listNew=new ArrayList();
		
//       for(int i:li)
//       {
//    	   if(i%2==0)
//    	   {
//    		   listNew.add(i);
//    	   }
//    		 
//       }
//       System.out.println(listNew);
		Map<Integer, Integer> even = set.stream().filter(i -> i % 2 == 0).collect(Collectors.toMap(Integer::intValue,Integer::intValue));//convert to Map
		System.out.println(even);
		List<Integer>list=li.stream().filter(n->n%2!=0).collect(Collectors.toList());//convert to list
		System.out.println(list);
	}
}
