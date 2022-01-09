package eaxmple.sample.test;

import java.util.Arrays;
import java.util.List;

public class SimpleExercise {
	
	public static void main(String [] args) {
		
		List<String> list = Arrays.asList("Pencil","Eraser","Paper", "Color Box");
		
		if (!list.isEmpty()) {
			System.out.println("list is not empty");
			break;
		}
	}

}
