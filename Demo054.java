class MathOperations {

    public int add(int a , int b) {
        return a + b;
    }

    public int add(int a , int b , int c) {
        return a + b + c;
    }

    public double add(double a , double b) {
        return a + b;
    }
}

class StudentDetails {

    public void display(String name) {
        System.out.println("Student Name: "+ name);
    }

    public void display(String name, int age) {
        System.out.println("Student Name: "+ name);
        System.out.println("Age: "+ age);
    }

    public void display(String name, int age , char grade) {
        System.out.println("Student Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Grade: "+ grade);
    }
}

public class Demo054{

    public static void main(String[] args) {
        MathOperations mathOps = new MathOperations();
        StudentDetails studDet = new StudentDetails();

        System.out.println("Addition Of 2 Integers: "+ mathOps.add(5 , 10));
        System.out.println("Addiiton Of 3 Integers: "+ mathOps.add(5, 10, 20));
        System.out.println("Addition of 2 Doubles: "+ mathOps.add(5.56 , 6.66));

        System.out.println("\n Student Details: ");
        studDet.display("Shashank");
        studDet.display("Vignesh" , 20);
        studDet.display("Pavan" , 10 , 'A');

    }
}