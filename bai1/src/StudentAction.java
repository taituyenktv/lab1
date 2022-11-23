import java.util.ArrayList;
import java.util.Scanner;

public class StudentAction  {

    public Student inputInfo(Scanner sc) {
//        ArrayList<Student> students = new ArrayList<>();

        System.out.println("Mời bạn nhập tên :");
        String name = sc.nextLine();
        System.out.println("Mời bạn nhập địa chỉ : ");
        String address = sc.nextLine();
        System.out.println("Mời bạn nhập tuổi: ");
        int age = 0;
        while (true) {

            try {
                age = Integer.parseInt(sc.nextLine());
                // khi nó nhập đúng sẽ trả về student mới vs các giá trị vừa nhập
                return new Student(name, address, age);
            } catch (Exception e) {
                // nhaajpsai sẽ báo lỗi và tiếp tục vòng lặp
                System.out.println("Lỗi nhập dữ liệu học sinh");
            }
        }
    }
}
