package home;

public class LinearSearch {
	public static void main(String[] args) {
		Integer[] test = new Integer[] {2,4,15,51,2,6,5,4,2,3,32,12,41};
		for(int e:test)
			System.out.println(linearSearch(test,e));
	}
	public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {
		for(int i = 0; i < list.length; i++) {
			if(key.compareTo(list[i]) == 0)
				return i;
		}
		return -1;
	}
}
