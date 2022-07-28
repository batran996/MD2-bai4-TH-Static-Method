public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // gọi phương thức
        Student.change();
        /////tạo các biến học sinh trong class studen với đối số cụ thẻ để in
        Student hs1 = new Student(111,"chinh");
        Student hs2 = new Student(222,"dung");
        Student hs3 = new Student(333,"hai");
        //////goi phuong thuc hien thi thong tin cu the
        hs1.display();
        hs2.display();
        hs3.display();

    }
}