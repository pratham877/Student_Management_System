package student;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InMemStudentService implements StudentService {

    private final List<Student> students;

    public InMemStudentService() {
        students = new ArrayList<>();

    }

    //CREATE
    @Override
    public List<Student> addStudent(Student student) {
        students.add(student);
        return students;
    }

    //READ
    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public Student getStudentById(long id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student getStudentByName(String name) {
        for (Student student : students) {
            if (student.getFullName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    //UPDATE

    @Override
    public Student updateStudentName(long id, String newFullName) {
        Student student = getStudentById(id);
        if (student != null) {
            student.setFullName(newFullName);
        }
        return student;
    }

    @Override
    public Student updateStudentEmail(long id, String newEmail) {
        Student student = getStudentById(id);
        if (student != null) {
            student.setEmail(newEmail);
        }
        return student;
    }

    @Override
    public Student updateStudentPassword(long id, String newPassword) {
        Student student = getStudentById(id);
        if (student != null) {
            student.setPassword(newPassword);
        }
        return student;
    }

    @Override
    public Student updateStudentPhone(long id, String newPhone) {
        Student student = getStudentById(id);
        if (student != null) {
            student.setPhone(newPhone);

        }
        return student;
    }

    @Override
    public Student updateStudentAddress(long id, String newAddress) {
        Student student = getStudentById(id);
        if (student != null) {
            student.setAddress(newAddress);

        }
        return student;
    }

    @Override
    public Student updateStudentAge(long id, int newAge) {
        Student student = getStudentById(id);
        if (student != null) {

            student.setAge(newAge);
        }
        return student;
    }



    @Override
    public boolean deleteStudent(long id) {
        Student student = getStudentById(id);
        if (student != null) {
            students.remove(student);
            return true;
        }
        return false;

    }
}
