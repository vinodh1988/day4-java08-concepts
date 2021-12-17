package com.functions.api;

import java.util.Arrays;
import java.util.List;

public class InputMapperMain {
    public static void main(String[] args) {
		List<String> list=Arrays.asList("John","Harry","Raj","Rakesh","Govind","Stepher","Mary");
		List<String> result;
		
		result = InputMapper.processString(list, (x)->x.toUpperCase());
		
		System.out.println(result);
		
		result = InputMapper.processString(list, (x)->{
			return "Hey!!!"+x;
		});
		
		System.out.println(result);
	}
}
