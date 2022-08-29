package home;
public class Max {
	public static void main(String[] args) {
		Integer[] test = new Integer[] {2,4,6,2,1,5,6,78,23,32,53,64,3,32};
		System.out.println(max(test));
	}
	public static <E extends Comparable<E>> E max(E[] list) {
		E max = list[0];
		for(E e:list) {
			if(e.compareTo(max) > 0)
				max = e;
		}
		return max;
	}
}
