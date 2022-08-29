package home;

public class BinarySearch {
	public static void main(String[] args) {
		Integer[] test = new Integer[] {0,1,2,3,4,5,6,7,8,23};
		for(int i = 0; i < 9; i++)
			System.out.println(binarySearch(test,i));
		System.out.println(binarySearch(test,23));
		System.out.println(binarySearch(test,20));
	}
	public static <E extends Comparable<E>> int binarySearch(E[] list, E key) {
		int left=0, right=list.length, mid;
		while(left <= right) {
			mid = (right+left)/2;
			if(key.compareTo(list[mid]) > 0) {
				if(left == mid)
					return -1;
				left = mid;
			}
			else if(key.compareTo(list[mid]) < 0) {
				right = mid;
			}
			else {
				return mid;
			}
		}
		System.out.println("right: " +right);
		return right;
	}
}
