import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // a add vào list này mà, nàếu a muốn add vào list kia thì a phải gọi nó ra dùng hàm set
        ArrayList<Student> students = new ArrayList<>();
        StudentAction studentAction = new StudentAction();
        Student student = studentAction.inputInfo(sc);
        students.add(student);

        while (true) {
            System.out.println("Bạn có muốn nhập thêm học sinh không ");
            System.out.println("1. có  ");
            System.out.println("2. không ");
            int chose = 0;
            try {
                chose = Integer.parseInt(sc.nextLine());
                while (true) {

                    if (chose == 2) {
                        System.out.println("Danh sách Học sinh mới là: ");
                        System.out.println(students);
                        return;

                    } else if (chose == 1) {
                        System.out.println("Bạn muốn thêm mấy bạn : ");
                        int studentNumber = 0;
                        try {
                            studentNumber = Integer.parseInt(sc.nextLine());
                        } catch (Exception e) {
                            System.out.println("Lỗi lập số bạn muốn thêm");
                        }

                        for (int i = 0; i < studentNumber; i++) {
                            Student st = studentAction.inputInfo(sc);
                            students.add(st);
                        }
                        System.out.println("Danh sách Học sinh mới là: ");
                        System.out.println(students);
                        return;
                    } else {
                        System.out.println("Bạn chọn sai mời bạn chọn lại ");
                        break;
                    }
                }

            } catch (Exception e) {
                System.out.println("Lỗi lựa chọn xin mời chọn lại");
            }
        }
    }
}


