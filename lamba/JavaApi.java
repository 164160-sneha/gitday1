package com.sneha.lamba;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class JavaApi {
	int p;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("value");
		int p = sc.nextInt();
		Predicate<Integer> Value = val -> val>2;
		if(Value.test(p)){
			System.out.println("true");
		}
		Consumer<Integer> Value1 = val ->  val++;
		process(Value1);
		System.out.println(Value1);
		
	}
	public static void process(Consumer<Integer> consumer){
		
		consumer.accept(10);		
	}

}
