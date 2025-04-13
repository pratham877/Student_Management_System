package io.github.pratham877.student_management_system.student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataBaseStudentService implements StudentService {

    private  StudentRepository studentRepository;

    @Autowired
    public DataBaseStudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> addStudents(Student students) {

        return List.of();
    }

    @Override
    public List<Student> addStudent(Student student) {
        return List.of();
    }

    @Override
    public List<Student> getAllStudents() {
        return List.of();
    }

    @Override
    public Student getStudentById(long id) {
        return null;
    }

    @Override
    public Student getStudentByName(String name) {
        return null;
    }

    @Override
    public Student updateStudentName(long id, String newFullName) {
        return null;
    }

    @Override
    public Student updateStudentEmail(long id, String newEmail) {
        return null;
    }

    @Override
    public Student updateStudentPassword(long id, String newPassword) {
        return null;
    }

    @Override
    public Student updateStudentPhone(long id, String newPhone) {
        return null;
    }

    @Override
    public Student updateStudentAddress(long id, String newAddress) {
        return null;
    }

    @Override
    public Student updateStudentAge(long id, int newAge) {
        return null;
    }

    @Override
    public boolean deleteStudent(long id) {
        return false;
    }
}
