import java.util.*;

class Demo30 {
    void arrayListMethod() {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(100);
        arrayList1.add(200);
        arrayList1.add(100);
        arrayList1.add(0);
        arrayList1.add(900);
        arrayList1.add(600);
        System.out.println("Elements of the list: ");

        Iterator<Integer> iterate = arrayList1.iterator();

        while (iterate.hasNext()) {
            System.out.println(iterate.next());
        }
    }

    public static void main(String[] args) {
        Demo30 obj = new Demo30();
        obj.arrayListMethod();
    }
}