package home;
import java.util.ArrayList;
public class SortArrayList {
	public static void main(String[] args) {
//		ArrayList<Integer> test = new ArrayList<Integer>();
//		test.add(13);
//		test.add(3);
//		test.add(24);
//		test.add(12);
//		test.add(14);
//		test.add(13);
//		test.add(-2);
//		test.add(0);
//		System.out.print(sort(test));
		ArrayList<String> test = new ArrayList<String>();
		test.add("abcd");
		test.add("abcd");
		test.add("eaf");
		test.add("sto");
		test.add("ny b");
		test.add(" eae");
		test.add("zzz");
		test.add("1234");
		SortArrayList.<String>sort(test);
		System.out.println(test);
	}
	public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
		Comparable[] array = new Comparable[list.size()];
		for(int i = 0; i < array.length; i++) {
			array[i] = list.remove(0);
			//System.out.println(list);
		}
		Comparable min, temp;
		int minIndex;
		for(int i = 0; i < array.length-1; i++) {
			min = array[i];
			minIndex = i;
			for(int j = i+1; j < array.length; j++)	{
				if(array[j].compareTo(min) < 0) {
					min = array[j];
					minIndex = j;
				}
			}
			temp = array[i];
			array[i] = min;
			array[minIndex] = temp;
		}
		for(Comparable e: array) {
			list.add((E) e);
		}
	}
}
