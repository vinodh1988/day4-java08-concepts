package com.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ParellelStreamProcessing {
    public static void main(String n[]) {
    	try {
			Stream<String> stream=Files.lines(Paths.get("D:\\File.txt"));
			stream=stream.parallel();
			stream.forEach(x->{
				System.out.println("Thread Name"+Thread.currentThread().getName());
				System.out.println(x);
			});
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
