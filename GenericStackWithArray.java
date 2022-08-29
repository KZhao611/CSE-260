package home;
/*
 * Revise the GenericStack class from the lecture notes to implement it 
 * using an array rather than an ArrayList. You should check the array 
 * size before adding a new element to the stack. If the array is full,
 * create a new array that doubles the current array size and copy the 
 * elements from the current array to the new array.
 */
public class GenericStackWithArray<E> {
	public static void main(String[] args) {
		GenericStackWithArray one = new GenericStackWithArray();
		System.out.println(one.isEmpty());
		for(int i = 0; i < 12; i++) {
			one.push(i);
			System.out.print(one.getSize() + " ");
			System.out.println(one);
		}
		System.out.println(one.isEmpty());
		System.out.println(one.peek());
		for(int i = 0; i < 12; i++) {
			System.out.println(one.pop());
		}
		System.out.println(one.isEmpty());
	}
	private E[] list;
	private int index = 0;
	public GenericStackWithArray() {
		list = (E[])new Object[1];
	}
	public int getSize() {
		return index;
	}
	public E peek() {
		return list[index-1];
	}
	public void push(E o) {
		if(index == list.length) {
			E[] temp = (E[])(new Object[getSize()*2]);
			for(int i = 0; i < getSize(); i++) {
				temp[i] = list[i];
			}
			list = temp;
		}
		list[index++] = o;
	}
	public E pop() {
		E o = list[--index];
		list[index] = null;
		return o;
	}
	public boolean isEmpty() {
		return index == 0;
	}
	@Override // Java annotation: also used at compile time to
	public String toString() { // detect override errors
		String ret = "stack: ";
		for(Object e: list) {
			ret += e + " ";
		}
		return ret;
	}
}
