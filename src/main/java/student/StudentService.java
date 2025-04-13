package student;

import java.util.List;

public interface StudentService {
    //CREATE
    List<Student> addStudent(Student student);

    //READ
    List<Student> getAllStudents();

    Student getStudentById(long id);

    Student getStudentByName(String name);

    Student updateStudentName(long id, String newFullName);

    Student updateStudentEmail(long id, String newEmail);

    Student updateStudentPassword(long id, String newPassword);

    Student updateStudentPhone(long id, String newPhone);

    Student updateStudentAddress(long id, String newAddress);

    Student updateStudentAge(long id, int newAge);

    boolean deleteStudent(long id);
}
