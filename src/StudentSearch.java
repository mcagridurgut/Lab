import java.util.ArrayList;

public class StudentSearch {
    public boolean studentExists(ArrayList<Student> students, String id) throws Exception {
        if (students.isEmpty()) {
            throw new Exception("Students list should not be empty!");
        }
        for (Student student: students)
            if (student.getId().equals(id))
                return true;

        return false;
    }
}
