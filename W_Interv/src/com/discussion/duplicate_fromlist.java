package com.discussion;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class duplicate_fromlist {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(20,60,40,20,40,30,50,70,80,80,90,10,10);
		
	Set<Integer> dup=	list.stream().filter(p->Collections.frequency(list,p)>1).collect(Collectors.toSet());
		System.out.println(dup);

	}

}
