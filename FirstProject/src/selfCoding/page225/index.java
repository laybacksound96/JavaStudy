package selfCoding.page225;

import selfCoding.page190.Student;
import java.util.ArrayList;
public class index {

    public static void main(String[] args) {
        ArrayList<Student> StudentList = new ArrayList<Student>();
        
        StudentList.add(new Student("James"));
        StudentList.add(new Student("Thomas"));
        StudentList.add(new Student("Edward"));

        for (int i = 0; i < StudentList.size(); i++) {
            Student student = StudentList.get(i);
            System.out.println(student.name+","+student.cardNumber);
        }
    }
}
