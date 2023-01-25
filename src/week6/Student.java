package week6;

public class Student extends People {
    String sid;
    double age;
    public Student(String name, String sid, double age) {
        super(29, name);
        this.sid = sid;
        this.age = age;
    }
    public void getAgeInt() {
        System.out.println(super.age);
    }
    @Override
    void run() {
        System.out.println("Student's run");
    }
}
