import java.util.ArrayList;

public class Student {

    private int id;
    private static int AUTO_ID = 1;
    private String name;
    private String address;
    private int age;
    // cái này bị null mà :v , a tưởng mình add vào thì nó phải có giá trị chứ nhỉ
//    private ArrayList<Student> students;
//
//    public void setStudents(ArrayList<Student> students) {
//        this.students = students;
//    }với lại danh sách in ra đều là người nhập đầu tiên chứ ko phải cả thêm vào nữa @@!

    public Student(String name, String address, int age) {
        int count = AUTO_ID++;
        this.id = count;
        this.name = name;
        this.address = address;
        this.age = age;
    }

    @Override
    public String toString() {
        // a muốn sửa đoạn hiển thị trả về thì sửa chỗ này nhé, chỉ là string với cộng chuỗi, nối cuỗi thôi
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}'+
                "\n"
                ;
    }
}
