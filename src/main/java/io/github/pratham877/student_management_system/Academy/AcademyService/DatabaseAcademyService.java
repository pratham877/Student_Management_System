package io.github.pratham877.student_management_system.Academy.AcademyService;

import io.github.pratham877.student_management_system.Academy.AcademyModel.Academy;
import io.github.pratham877.student_management_system.Academy.AcademyRepository.AcademyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Qualifier("databaseAcademyService")
@Service
public class DatabaseAcademyService implements AcademyService {
    private AcademyRepository academyRepository;

    @Autowired
    public DatabaseAcademyService(AcademyRepository academyRepository) {
        this.academyRepository = academyRepository;

    }

    @Override
    public List<Academy> addAcademy(Academy academy) {
        return List.of();
    }

    @Override
    public List<Academy> getAllAcademies() {
        return List.of();
    }

    @Override
    public Academy getAcademyByDepartment(String department) {
        return null;
    }

    @Override
    public Academy updateCourse(String department, String newCourse) {
        return null;
    }

    @Override
    public Academy updateYear(String department, int newYear) {
        return null;
    }

    @Override
    public Academy updateMarks(String department, float newMarks) {
        return null;
    }

    @Override
    public Academy updateSubjects(String department, List<String> newSubjects) {
        return null;
    }

    @Override
    public boolean deleteAcademy(String department) {
        return false;
    }
}
