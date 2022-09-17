package cse260;
import java.util.*;
public class DateReformatter {
	public static void main(String[] args) {
		System.out.println(reformatDate("5/17/2025"));
		System.out.println(reformatDate("12/31/2030"));
		System.out.println(reformatDate("9/8/2055"));
		System.out.println(reformatDate("8/5/2070"));
	}
	public static String reformatDate(String date) {
		HashMap<String, String> months = new HashMap<String,String>();
		String[] month = new String[] {"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};
		for(int i = 1; i < 13; i++) {
			months.put(String.valueOf(i), month[i-1]);
		}
		int first = date.indexOf("/");
		int second = date.indexOf("/",first+1);
		return (second-first==2?"0":"") + date.substring(first+1,second) +  "-" + months.get(date.substring(0,first)) + "-" + date.substring(date.length()-2);
	}
}
