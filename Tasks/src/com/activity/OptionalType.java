package com.activity;

import java.util.Optional;

public class OptionalType {
   public static Optional<String> getData(int x){
	   if(x%2==0)
		   return Optional.ofNullable(null);
	   else
		   return Optional.of("India");
   }
}
