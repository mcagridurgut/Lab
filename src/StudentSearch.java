import java.util.ArrayList;

public class StudentSearch {
    public boolean studentExists(ArrayList<Student> students, String id) {
        for (Student student: students)
            if (student.getId().equals(id))
                return true;

        return false;
    }
}
