package com.Epam.Task;
//Palindromatic Strings Program
import java.util.*;
import java.util.stream.Collectors;
public class Palindromes {
	public static String getReverse(String s){
		String s1 = "";
		char ch[] = s.toCharArray();
		int n = s.length(), j = n -1;
		for(int i = 0;i < n/2;i++){
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			j--;
		}
		s1 = String.valueOf(ch);
		return s1;
	}
	public static ArrayList<String> IsPalindrome(ArrayList<String> res){
		ArrayList<String> ar = (ArrayList<String>) res.stream().filter(i->i.equals(getReverse(i))).collect(Collectors.toList());
		return ar;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements:");
		int n = sc.nextInt();
		ArrayList<String> ar = new ArrayList<>();
		System.out.println("Enter Strings:");
		sc.nextLine();
		for(int i = 0;i < n;i++){ 
			String s = sc.nextLine();
			ar.add(s);
		}
		String s1 = "";
		System.out.println("The Palindromatic Strings are:");
		ArrayList<String> res = IsPalindrome(ar);
		for(int i = 0;i < res.size();i++){
			System.out.println(res.get(i));
		}


	}

}
