package com.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileOperation {
     public static void main(String[] args) {
	      try {
			Stream<String> stream=Files.lines(Paths.get("D:\\File.txt"));
			stream.filter(x->
			{
			  System.out.println("Intermediate Filter->"+x);
			  return x.length()>20;
			
			}).map(
			x->{
			System.out.println("Intermediate Operation ->"+x);
			return x.toUpperCase();}).
			forEach(x->{
				System.out.println("Terminal operetation ->"+x);
			});
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	 }
}
