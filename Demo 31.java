import java.util.HashSet;
 class Demo31 {
public static void main(String[] args) {

HashSet hashSet = new HashSet();
hashSet.add(100);
hashSet.add("SHASHANK");
hashSet.add(9999.99);
System.out.println(hashSet);

for(Object x: hashSet) {
System.out.println(x);
}
}
}