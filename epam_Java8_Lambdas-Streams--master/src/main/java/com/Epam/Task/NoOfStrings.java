package com.Epam.Task;
//Letters that consists of 3 characters and starting with 'a'
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class NoOfStrings {
	public static List<String> Result(List<String> list1) {
		List<String> res = list1.stream().filter(String->(String.length() == 3) && String.charAt(0) == 'a')
				.collect(Collectors.toList());
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = sc.nextInt();
		List<String> list1 = new ArrayList<String>();
		System.out.println("Enter n number of strings:");
		sc.nextLine();
		for(int i = 0;i < n;i++){
			String s = sc.nextLine();
			list1.add(s);
		}
		System.out.println("The strings that are starting with letter 'a' and have length 3 are ");
		List<String> res = Result(list1);
		res.forEach(t->System.out.println(t));
	}

	

}
