public class Student {
    private int rollNo;
    private String name;
    private static String college = "BBDIT";
    ////////////contructor

    public Student(int r, String n) {
        rollNo = r;
        name = n;
    }
    ///// phương thức
    static void change(){
        college = "RIKKEI ACADEMY";
    }
    void display(){
        System.out.println(rollNo + " " + name + " " + college);
    }
}
