import java.util.HashSet;
class HashSetDemo1 {
	void HSetMethod() {
		
		HashSet hashSet = new HashSet();
		hashSet.add(100);
		hashSet.add("Shashank");
		hashSet.add(9999.99);
		System.out.println(hashSet);		

		for(Object x: hashSet) {
			System.out.println(x);
		}
	}
}


class Demo31 {
	public static void main(String[] args) {
		HashSetDemo1 obj = new HashSetDemo1();
		obj.HSetMethod();
		}
	}