package data;

public class CompareStringObject {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		System.out.println("obj1 = obj2 :" + obj1== obj2); // false
		System.out.println("obj1 equals obj2 :" + obj1.equals(obj2)); // false
		obj1 = obj2;
		System.out.println("obj1 = obj2 :" + (obj1== obj2)); // true
	}
}
